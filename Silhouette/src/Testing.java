import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

public class Testing {
    public static void main(String[] args) {

        RuleSet a = new RuleSet.Builder("asd")
                .addRule(Property.COLOR, Color.MAGENTA)
                .build();

        StyleSheet myStyleSheet = new StyleSheet.Builder()
                .addStatement(a)
                .build();

        myStyleSheet.initialize("main");
    }
}
