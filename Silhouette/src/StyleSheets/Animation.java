package StyleSheets;

import StyleSheets.BaseComponents.AtRule;
import StyleSheets.Values.AtRuleType;

public class Animation extends AtRule {

    public Animation(final Builder builder) {
        super(builder);
    }

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

        public Animation Build() {
            return new Animation(this);
        }
    }

    //public void
    /*
    public Animation(String name){
        super("keyframes", "name");

    }

    public void AddKeyframe(String name){

    }

    public class Keyframe extends Statement {
        public Keyframe(String name)
        {
            identifier = name;
        }
    }

     */
}
