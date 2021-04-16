import CSS.LowLevel.Style.Grid;
import CSS.LowLevel.Style.RuleSet;
import CSS.LowLevel.StyleSheet;
import HTML.LowLevel.Component.HTML;
import HTML.LowLevel.Element.Container;

public class Scenario11 {
    public static void main(String[] args) {
        HTML HTMLPage = new HTML();

        Container HTMLbody = new Container.Builder()
                .setType("body")
                //.setClass("body")
                //.applyClass("body")
                .build();

        HTMLPage.append(HTMLbody);

        StyleSheet css = new StyleSheet("style");


        RuleSet CSSpage = new RuleSet();

        Grid grid = new Grid("body", "3","1");
        grid.addRule("width", "1000px");

    }
}
