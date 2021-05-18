package StyleSheets;

import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.Values.Property;

/**
 * Defines a CSS flex-box that is used to manipulate flow behaviour of HTML elements.
 * For example, it is useful to arrange HTMl elements side-to-side with even relative space between each other.
 * Automatically, the FlexBox class will add a rule that sets display property to "flex"
 */
public class FlexBox extends RuleSet {

    /**
     * Constructor used by builder to build a new FlexBox object.
     * @param builder the builder for grid
     */
    public FlexBox(final Builder builder) {
        super(builder);

    }

    /**
     * The builder class for the flex-box.
     * It is an inner static class used to build an immutable instance of a FlexBox object.
     */
    public static class Builder extends RuleSet.Builder<Grid.Builder> {

        /**
         * Constructor for flex-box builder.
         * @param selector the selector used as the identifier of the flex-box
         */
        public Builder(final String selector) {
            super(selector);
            addRule(Property.DISPLAY, "flex");
        }

        /**
         * Builds the flex-box and returns it.
         * @return FlexBox constructed by the builder
         */
        public FlexBox build() {
            return new FlexBox(this);
        }
    }
}
