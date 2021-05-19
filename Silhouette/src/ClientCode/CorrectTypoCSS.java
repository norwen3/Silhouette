package ClientCode;

import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.ColorModel;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

public class CorrectTypoCSS {
    public static void main(String[] args) {

        // The Property and Color enum prevents misspellings
        // ColorModel.Hex uses spellchecks in the implementation to verify validity
        RuleSet colors = new RuleSet.Builder(".colors")
                .addRule(Property.COLOR, Color.MAGENTA)
                .addRule(Property.BACKGROUND_COLOR, ColorModel.Hex("FFFFFF"))
                .build();

        // The file name lacks the ".css" suffix, but it will add it in compilation.
        // The outputFolder is a path, but lacks "/" at the end, but it will still compile
        StyleSheet myStyleSheet = new StyleSheet.Builder("main", "out/WebFiles")
                .build();

        myStyleSheet.initialize();
    }
}
