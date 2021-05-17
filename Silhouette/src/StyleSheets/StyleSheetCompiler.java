package StyleSheets;

import StyleSheets.BaseComponents.AtRule;
import StyleSheets.BaseComponents.Implementation.Statement;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public abstract class StyleSheetCompiler {

    private static int TabSpaces = 4;

    public static void compile(StyleSheet styleSheet) {
        StringBuilder css = new StringBuilder();

        compileCSS(css, styleSheet);

        try {
            // Initializes the html generation
            BufferedWriter writer = new BufferedWriter(new FileWriter(styleSheet.getFileName() + ".css"));
            writer.write(css.toString());
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void compileCSS(StringBuilder str, StyleSheet styleSheet) {
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
        str.append(addTabs(tabs) + " {\n");

        // Compile all rulesets
        for (RuleSet ruleSet : atRule.getRuleSets()) {
            str.append(compileRuleSet(ruleSet, 1));
        }

        // Compile all rules
        for (String rule : atRule.getRules()) {
            str.append(addTabs(1) + rule + "\n");
        }

        str.append(addTabs(tabs) + "}\n\n");

        return str.toString();
    }

    private static String compileRuleSet(RuleSet ruleSet, int tabs) {
        StringBuilder str = new StringBuilder();

        str.append(addTabs(tabs) + ruleSet.getIdentifier());
        str.append(addTabs(tabs) + " {\n");

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
