package ClientCode;

import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Grid;
import StyleSheets.Values.Property;

public class CSSHighLevel {
    public static void main(String[] args) {

        // Grid object inherits from RuleSet, thus having the addRule() method
        // setTemplateAreas() is unique to the Grid object
        // Grid object automatically sets "display: grid;"
        Grid myGrid = new Grid.Builder("#mainGrid")
                //.addRule(Property.DISPLAY, "grid") not needed!
                .addRule(Property.GRID_TEMPLATE_COLUMNS, "10px 20px 30px")
                .addRule(Property.GRID_TEMPLATE_ROWS, "40em 50em 60em")
                .setTemplateAreas(
                        "header header header",
                        "main main aside",
                        "footer footer footer")
                .build();

        StyleSheet myStyleSheet = new StyleSheet.Builder("main.css", "WebFiles/")
                .applyStyle(myGrid)
                .build();

        myStyleSheet.initialize();
    }
}
