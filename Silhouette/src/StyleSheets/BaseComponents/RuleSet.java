package StyleSheets.BaseComponents;

import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

/**
 * Defines a CSS rule set that represents a block of CSS statements, including the selector and curly braces.
 * The general syntax is @SELECTOR {STATEMENTS}
 */
public class RuleSet extends Statement {

    /**
     * Constructor used by builder to build a new RuleSet object.
     * @param builder the builder for rule set
     */
    protected RuleSet(final Builder<?> builder){
        identifier = builder.identifier;
        rules = builder.rules;
    }

    /**
     * Gets the identifier for the rule set as a String.
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Gets the list of rules stored in the rule set. Each rule is stored as strings.
     * @return ArrayList<String>
     */
    public ArrayList<String> getRules() {
        return rules;
    }

    /**
     * The builder class for the rule set.
     * It is an inner static class used to build an immutable instance of a RuleSet object.
     * @param <T> generic builder
     */
    public static class Builder <T extends Builder<T>>{
        /**
         * @see Statement#identifier
         */
        public String identifier;
        /**
         * @see Statement#rules
         */
        public ArrayList<String> rules = new ArrayList<>();

        /**
         * Constructor for rule set builder.
         * @param selector the selector used as the identifier of the rule set
         */
        public Builder(final String selector) {
            identifier = selector;
        }

        /**
         * Adds a rule to be nested in the rule set.
         * This overload takes pure CSS as the argument and adds it to the list of rules.
         * @param css the rule which will be added to the list of rules
         * @return builder of generic type for rule sets
         */
        public T addRule(final String css) {
            rules.add(css);
            return (T)this;
        }

        /**
         * Adds a rule to be nested in the rule set.
         * This overload takes a property and a value as arguments and adds it to the list of rules.
         * @param property the property via Property enum
         * @param value the value as a String
         * @return builder of generic type for rule sets
         */
        public T addRule(final Property property, final String value) {
            addRule(StyleManager.stringifyEnum(property) + ": " + value + ";");
            return (T)this;
        }

        /**
         * Adds a rule to be nested in the rule set.
         * This overload takes a property and a color as arguments and adds it to the list of rules.
         * @param property the property via Property enum
         * @param color the color via Color enum
         * @return builder of generic type for rule sets
         */
        public T addRule(final Property property, final Color color) {
            addRule(StyleManager.stringifyEnum(property) + ": " + StyleManager.stringifyEnum(color) + ";");
            return (T)this;
        }

        /**
         * Builds the rule set and returns it.
         * @return RuleSet constructed by the builder
         */
        public RuleSet build() {
            return new RuleSet(this);
        }
    }
}