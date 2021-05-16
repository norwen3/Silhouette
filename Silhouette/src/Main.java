import StyleSheets.BaseComponents.*;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Values.Color;

public class Main {
    public static void main(String[] args) {

        RuleSet rule1 = new RuleSet(".colors");
        rule1.addRule("color", "magenta");
        rule1.addRule("color", Color.Hex("FFFFFF"));
        rule1.addRule("background-color: blue;");

        AtRule atRule1 = new AtRule("Media", "(Max-Width: 1000px)");
        atRule1.addRuleSet(rule1);
        atRule1.addRuleSet(rule1);

        StyleSheet myStyleSheet = new StyleSheet("bruh");
        myStyleSheet.applyStyle(rule1);
        myStyleSheet.applyStyle(atRule1);

        myStyleSheet.Initialize();
    }
}
