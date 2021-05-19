package StyleSheets.BaseComponents;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class StyleSheetCompiler {

    private static int TabSpaces = 4;

    public static void compile(StyleSheet styleSheet) {
        StringBuilder css = new StringBuilder();

        compileCSS(css, styleSheet);

        try {
            // Initializes the css generation
            String fileName = styleSheet.getFileName();
            String outputFolder = styleSheet.getOutputFolder();

            if (!fileName.contains(".css")) {
                fileName = fileName.concat(".css");
            }

            if (!outputFolder.endsWith("/") && outputFolder.length() > 0) {
                outputFolder = outputFolder.concat("/");
            }

            File file = new File( outputFolder + fileName);
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(css.toString());
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void compileCSS(StringBuilder str, StyleSheet styleSheet) {
        str.append(styleSheet.getRawCSS());

        for (Statement statement : styleSheet.getStatements()) {
            // Check if statement is a RuleSet or an AtRule
            if (statement instanceof RuleSet) {

                str.append(compileRuleSet((RuleSet)statement, 0));

            } else if (statement instanceof AtRule) {

                str.append(compileAtRule((AtRule)statement, 0));

            }

        }
    }

    private static String compileAtRule(AtRule atRule, int tabs) {
        StringBuilder str = new StringBuilder();

        str.append(addTabs(tabs) + atRule.getIdentifier());

        if (!atRule.getRules().isEmpty() || !atRule.getRuleSets().isEmpty()) {
            str.append(" {\n");

            // Compile all rulesets
            for (RuleSet ruleSet : atRule.getRuleSets()) {
                str.append(compileRuleSet(ruleSet, 1));
            }

            // Compile all rules
            for (String rule : atRule.getRules()) {
                str.append(addTabs(1) + rule + "\n");
            }

            str.append(addTabs(tabs) + "}\n\n");
        }

        return str.toString();
    }

    private static String compileRuleSet(RuleSet ruleSet, int tabs) {
        StringBuilder str = new StringBuilder();

        str.append(addTabs(tabs) + ruleSet.getIdentifier());
        str.append(" {\n");

        for (String rule : ruleSet.getRules()) {
            str.append(addTabs(tabs + 1) + rule + "\n");
        }

        str.append(addTabs(tabs) + "}\n\n");

        return str.toString();
    }

    private static String addTabs(int count) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < count * TabSpaces; i++) {
            str.append(" ");
        }
        return str.toString();
    }
}
