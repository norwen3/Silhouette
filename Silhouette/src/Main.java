import StyleSheets.BaseComponents.*;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Values.Color;

public class Main {
    public static void main(String[] args) {

        /*
        RuleSet rule1 = new RuleSet(".colors");
        rule1.addRule("color", "magenta");
        rule1.addRule("color", Color.Hex("FFFFFF"));
        rule1.addRule("background-color: blue;");

         */

        RuleSet rule1 = new RuleSet.Builder()
                                   .setSelector(".colors")
                                   .addRule("color", "magenta")
                                   .addRule("color", Color.Hex("FFFFFF"))
                                   .addRule("background-color", "blue")
                                   .build();

        /*
        AtRule atRule1 = new AtRule("Media", "(Max-Width: 1000px)");
        atRule1.addRuleSet(rule1);
        atRule1.addRuleSet(rule1);
         */

        AtRule atRule1 = new AtRule.Builder()
                                  .setIdentifier("media", "(min-width 1000px)")
                                  .addRuleSet(rule1)
                                  .addRuleSet(rule1)
                                  .build();


        StyleSheet myStyleSheet = new StyleSheet.Builder()
                                                .setFileName("bruh")
                                                .applyStyle(rule1)
                                                .applyStyle(atRule1)
                                                .build();

        myStyleSheet.Initialize();
    }
}
