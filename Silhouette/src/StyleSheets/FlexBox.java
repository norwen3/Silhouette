package StyleSheets;

import StyleSheets.BaseComponents.Implementation.StyleManager;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.Values.Property;

public class FlexBox extends RuleSet {

    public FlexBox(final Builder builder) {
        super(builder);

    }

    public static class Builder extends RuleSet.Builder<Grid.Builder> {

        public Builder() {
            addRule(Property.DISPLAY, "flex");
        }

        public FlexBox build() {
            return new FlexBox(this);
        }
    }
}
