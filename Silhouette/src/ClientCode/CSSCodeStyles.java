package ClientCode;

import StyleSheets.BaseComponents.AtRule;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Grid;
import StyleSheets.Size;
import StyleSheets.Values.AtRuleType;
import StyleSheets.Values.Property;

public class CSSCodeStyles {
    public static void main(String[] args) {
        // Here is another code style
        StyleSheet myStyleSheet = new StyleSheet.Builder("main.css", "WebFiles/")
                .applyStyle(new RuleSet.Builder("#first")
                        .addRule(Property.FONT_SIZE, Size.pt(15))
                        .addRule(Property.FONT_FAMILY, "Areal")
                        .build())
                .applyStyle(new AtRule.Builder(AtRuleType.MEDIA, "(min-width: 1000px)")
                        .addRuleSet(new RuleSet.Builder("#second")
                                .addRule(Property.POSITION, "fixed")
                                .addRule(Property.LEFT, "0")
                                .build())
                        .build())
                .build();

        myStyleSheet.initialize();
    }
}
