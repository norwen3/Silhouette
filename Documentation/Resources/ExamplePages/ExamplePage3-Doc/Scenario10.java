import CSS.LowLevel.Style.RuleSet;
import CSS.LowLevel.StyleSheet;

public class Scenario10 {
    public static void main(String[] args) {
        StyleSheet css = new StyleSheet("style");


        RuleSet header = new RuleSet();
        header
              .addRule("background-image", "linear-gradient(to right, blue, red)");



    }
}
