package StyleSheets;

import StyleSheets.BaseComponents.Implementation.StyleManager;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.Values.Property;

/**
 * Specifies a CSS Grid.
 */
public class Grid extends RuleSet {

    public Grid(final Builder builder) {
        super(builder);

    }

    public static class Builder extends RuleSet.Builder<Builder> {
        public Builder setTemplateAreas(String... areas){

            for (int i = 0; i < areas.length; i++) {
                areas[i] = "\"" + areas[i] + "\"";
            }


            String value = StyleManager.combineValuesWithSeparator(" ", areas);

            addRule(Property.GRID_TEMPLATE_AREAS, value);
            return this;
        }

        public Builder setTemplate(String... values){
            String rule = StyleManager.combineValuesWithSeparator(" / ", values);
            addRule(rule);
            return this;
        }

        public Grid build() {
            return new Grid(this);
        }
    }
/*  @TODO: Unecessary, remove?
    public void setColumns(String columns){
        addRule("grid-template-columns", columns);
    }

    public void setRows(String rows){
        addRule("grid-template-rows", rows);
    }

    public void setAutoColumns(String value){
        addRule("grid-auto-columns", value);
    }

    public void setAutoRows(String value){
        addRule("grid-auto-rows", value);
    }

    public void setAutoFlow(String value){
        addRule("grid-auto-flow", value);
    }

    public void setRowGap(String value){
        addRule("grid-row-gap", value);
    }

    public void setColumnGap(String value){
        addRule("grid-column-gap", value);
    }

    public void setGap(String value){
        addRule("grid-gap", value);
    }

    public void setJustifySelf(String value){
        addRule("justify-self", value);
    }

    public void setJustifyItems(String value){
        addRule("justify-items", value);
    }

 */
/*  @TODO: Temporarily commented out
    public void setTemplateAreas(String... values){
        String rule = CSSManager.combineValuesWithSeparator(" ", values);
        addRule(rule);
    }

    /**
     * Shorthand for grid-template-columns, grid-template-rows and grid-template-areas. Seperated by / sign
     * @param values
     */

    /* @TODO: Temporarily commented out
    public void setTemplate(String... values){
        String rule = CSSManager.combineValuesWithSeparator(" / ", values);
        addRule(rule);
    }

    public void addArea(String areaName, int rowStart, int rowEnd, int colStart, int colEnd){
        // @TODO: Figure this out
    }

     */
}