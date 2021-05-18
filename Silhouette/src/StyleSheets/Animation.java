package StyleSheets;

import StyleSheets.BaseComponents.AtRule;
import StyleSheets.Values.AtRuleType;

/**
 * Defines an Animation at-rule that is used to create animations.
 */
public class Animation extends AtRule {

    /**
     * Constructor used by builder to build a new Animation object.
     * @param builder the builder for grid
     */
    public Animation(final Builder builder) {
        super(builder);
    }

    /**
     * The builder class for the animation.
     * It is an inner static class used to build an immutable instance of an Animation object.
     */
    public static class Builder extends AtRule.Builder<Animation.Builder> {

        /**
         * Constructor for at-rule builder.
         * This overload only allows type specification.
         * @param type The type of at-rule expressed with the AtRuleType enum
         */
        public Builder(final AtRuleType type) {
            super(type);
        }

        /**
         * Constructor for at-rule builder.
         * This overload only allows type specification.
         * @param type The type of at-rule expressed with the AtRuleType enum
         * @param constraint The constraint followed up after the at-rule type
         */
        public Builder(final AtRuleType type, final String constraint) {
            super(type, constraint);
        }

        /**
         * Builds the animation and returns it.
         * @return Animation constructed by the builder
         */
        public Animation Build() {
            return new Animation(this);
        }
    }
}
