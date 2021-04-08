import CSS.LowLevel.Style.RuleSet;
import CSS.LowLevel.StyleSheet;

public class Scenario9 {
    public static void main(String[] args){
        StyleSheet css = new StyleSheet("style");
        RuleSet a = new RuleSet();
        a
         .setSelector("a")
         .addRule("text-decoration", "noen");

        RuleSet aHover = new RuleSet();
        aHover
              .setSelector("a:Hover")
              .addRule("color", "red");



    }
}
