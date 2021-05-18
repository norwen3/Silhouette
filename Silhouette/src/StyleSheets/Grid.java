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

        public Builder() {
            addRule(Property.DISPLAY, "grid");
        }

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
            addRule(Property.GRID_TEMPLATE, rule);
            return this;
        }

        public Grid build() {
            return new Grid(this);
        }
    }
}