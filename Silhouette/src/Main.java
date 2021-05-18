import StyleSheets.BaseComponents.*;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Grid;
import StyleSheets.Values.Color;
import StyleSheets.Values.ColorModel;
import StyleSheets.Values.Property;

public class Main {
    public static void main(String[] args) {

        RuleSet rule1 = new RuleSet.Builder()
                                   .setSelector(".colors")
                                   .addRule(Property.COLOR, "magenta")
                                   .addRule(Property.COLOR, ColorModel.Hex("FFFFFF"))
                                   .addRule(Property.BACKGROUND_COLOR, Color.INDIGO)
                                   .build();

        Grid rule2 = new Grid.Builder()
                             .setSelector(".grid")
                             .setTemplateAreas("bruh bruh", "moment moment")
                             .build();

        AtRule atRule1 = new AtRule.Builder()
                                  .setIdentifier("media", "(min-width: 1000px)")
                                  .addRuleSet(rule1)
                                  .addRuleSet(rule1)
                                  .build();


        StyleSheet myStyleSheet = new StyleSheet.Builder()
                                                .setFileName("bruh")
                                                .applyStyle(rule1)
                                                .applyStyle(atRule1)
                                                .applyStyle(rule2)
                                                .build();

        myStyleSheet.Initialize();
    }
}