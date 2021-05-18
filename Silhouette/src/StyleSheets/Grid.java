package StyleSheets;

import StyleSheets.BaseComponents.StyleManager;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.Values.Property;

/**
 * Defines a CSS Grid that is used to manipulate layout of HTML elements.
 * For example, it is often used to define a page-layout specifying the position of header, main and footer.
 * Automatically, the Grid class will add a rule that sets display property to "grid"
 */
public class Grid extends RuleSet {

    /**
     * Constructor used by builder to build a new Grid object.
     * @param builder the builder for grid
     */
    public Grid(final Builder builder) {
        super(builder);
    }

    /**
     * The builder class for the grid.
     * It is an inner static class used to build an immutable instance of a Grid object.
     */
    public static class Builder extends RuleSet.Builder<Builder> {

        /**
         * Constructor for grid builder.
         * @param selector the selector used as the identifier of the grid
         */
        public Builder(final String selector) {
            super(selector);
            addRule(Property.DISPLAY, "grid");
        }

        /**
         * Sets the grid-template-areas property for the grid.
         * It takes String varargs that specify each area in the grid-layout.
         * @param areas the areas which make up the grid-template-areas
         * @return builder of generic type for grids
         */
        public Builder setTemplateAreas(final String... areas){

            for (int i = 0; i < areas.length; i++) {
                areas[i] = "\"" + areas[i] + "\"";
            }

            String value = StyleManager.combineValuesWithSeparator(" ", areas);
            addRule(Property.GRID_TEMPLATE_AREAS, value);
            return this;
        }

        /**
         * Sets the grid-template which is a shorthand for defining grid columns, rows and areas.
         * It takes String varargs that specify each value for the grid-template.
         * @param values the values used in the grid-template
         * @return builder of generic type for grids
         */
        public Builder setTemplate(final String... values){
            String rule = StyleManager.combineValuesWithSeparator(" / ", values);
            addRule(Property.GRID_TEMPLATE, rule);
            return this;
        }

        /**
         * Builds the grid and returns it.
         * @return Grid constructed by the builder
         */
        public Grid build() {
            return new Grid(this);
        }
    }
}