package StyleSheets.BaseComponents;

import StyleSheets.Values.AtRuleType;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

/**
 * Defines a CSS at-rule that is used to instruct CSS how to behave.
 * It does so by defining the at-rule type along with an optional rule.
 * The general syntax is @IDENTIFIER (RULE);
 * For example, instruct the browser to use UTF-8 with @charset "utf-8".
 */
public class AtRule extends Statement {

    /**
     * A list of rule sets of arbitrary length. This is used to nest rule sets inside the at-rule.
     */
    private final ArrayList<RuleSet> ruleSets;

    /**
     * Constructor used by builder to build a new AtRule object.
     * @param builder the builder for at-rules
     */
    protected AtRule(final Builder<?> builder) {
        identifier = builder.identifier;
        rules = builder.rules;
        ruleSets = builder.ruleSets;
    }

    /**
     * Gets the identifier for the at-rule as a String.
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Gets the list of rules stored in the at-rule. Each rule is stored as strings.
     * @return ArrayList<String>
     */
    public ArrayList<String> getRules() {
        return rules;
    }

    /**
     * Gets the list of rule sets in the at-rule.
     * @return ArrayList<RuleSet>
     */
    public ArrayList<RuleSet> getRuleSets() {
        return ruleSets;
    }

    /**
     * The builder class for the at-rule.
     * It is an inner static class used to build an immutable instance of an AtRule object.
     * @param <T> generic builder
     */
    public static class Builder<T extends Builder<T>> {

        /**
         * @see Statement#identifier
         */
        public String identifier;
        /**
         * @see Statement#rules
         */
        public ArrayList<String> rules = new ArrayList<>();
        /**
         * @see AtRule#ruleSets
         */
        public ArrayList<RuleSet> ruleSets = new ArrayList<>();

        /**
         * Constructor for at-rule builder.
         * This overload only allows type specification.
         * @param type the type of at-rule expressed with the AtRuleType enum
         */
        public Builder(final AtRuleType type) {
            identifier = "@" + StyleManager.stringifyEnum(type);
        }

        /**
         * Constructor for at-rule builder.
         * This overload only allows type specification.
         * @param type the type of at-rule expressed with the AtRuleType enum
         * @param rule the rule followed up after the at-rule type
         */
        public Builder(final AtRuleType type, final String rule) {
            identifier = "@" + StyleManager.stringifyEnum(type) + " " + rule;
        }

        /**
         * Adds a rule set to be nested in the at-rule.
         * @param ruleSet the rule set which will be added to the list of rule sets
         * @return builder of generic type for at-rules
         */
        public T addRuleSet(final RuleSet ruleSet) {
            ruleSets.add(ruleSet);
            return (T)this;
        }

        /**
         * Adds a rule to be nested in the at-rule.
         * This overload takes pure CSS as the argument and adds it to the list of rules.
         * @param css the rule which will be added to the list of rules
         * @return builder of generic type for at-rules
         */
        public T addRule(final String css) {
            rules.add(css);
            return (T)this;
        }

        /**
         * Adds a rule to be nested in the at-rule.
         * This overload takes a property and a value as arguments and adds it to the list of rules.
         * @param property the property via Property enum
         * @param value the value as a String
         * @return builder of generic type for at-rules
         */
        public T addRule(final Property property, final String value) {
            addRule(StyleManager.stringifyEnum(property) + ": " + value + ";");
            return (T)this;
        }

        /**
         * Adds a rule to be nested in the at-rule.
         * This overload takes a property and a color as arguments and adds it to the list of rules.
         * @param property the property via Property enum
         * @param color the color via Color enum
         * @return builder of generic type for at-rules
         */
        public T addRule(final Property property, final Color color) {
            addRule(StyleManager.stringifyEnum(property) + ": " + StyleManager.stringifyEnum(color) + ";");
            return (T)this;
        }

        /**
         * Builds the at-rule and returns it.
         * @return AtRule constructed by the builder
         */
        public AtRule build() {
            return new AtRule(this);
        }
    }
}
