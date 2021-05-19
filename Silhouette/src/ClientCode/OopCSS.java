package ClientCode;

import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Size;
import StyleSheets.Values.Property;

public class OopCSS {
    public static void main(String[] args) {
        int base = 16;
        String small = Size.pixels(base / 2);
        String medium = Size.pixels(base);
        String large = Size.pixels(base * 2);

        RuleSet boxModel = new RuleSet.Builder(".boxModel")
                .addRule(Property.MARGIN_TOP, small)
                .addRule(Property.MARGIN_BOTTOM, small)
                .addRule(Property.MARGIN_LEFT, large)
                .addRule(Property.MARGIN_RIGHT, large)
                .addRule(Property.PADDING, medium)
                .build();

        StyleSheet myStyleSheet = new StyleSheet.Builder("main.css", "WebFiles/")
                .applyStyle(boxModel)
                .build();

        myStyleSheet.initialize();
    }
}
