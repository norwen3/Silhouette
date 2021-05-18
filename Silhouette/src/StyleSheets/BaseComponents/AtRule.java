package StyleSheets.BaseComponents;

import StyleSheets.Values.AtRuleType;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

/*
* @TODO:
* If ruleSets is empty, compile as:
* @[KEYWORD] (RULE);
*
* Else, compile with curly braces:
* @[KEYWORD] (RULE){
*     ruleSets...
* }
*
 */

/**
 * Defines a CSS at-rule, which follows the general syntax @[KEYWORD] (RULE);
 */
public class AtRule extends Statement {

    // Instance variables

    private final ArrayList<RuleSet> ruleSets;

    // Constructors

    protected AtRule(final Builder<?> builder) {
        identifier = builder.identifier;
        rules = builder.rules;
        ruleSets = builder.ruleSets;
    }

    // Getters

    public String getIdentifier() {
        return identifier;
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public ArrayList<RuleSet> getRuleSets() {
        return ruleSets;
    }

    public static class Builder<T extends Builder<T>> {
        public String identifier = "@";
        public ArrayList<String> rules = new ArrayList<>();
        public ArrayList<RuleSet> ruleSets = new ArrayList<>();

        public T setIdentifier(String css) {
            return (T)this;
        }

        public T setIdentifier(AtRuleType property, String rule) {
            identifier = "@" + StyleManager.stringifyEnum(property) + " " + rule;
            return (T)this;
        }

        public T addRuleSet(RuleSet ruleSet) {
            ruleSets.add(ruleSet);
            return (T)this;
        }

        public T addRule(String css) {
            rules.add(css);
            return (T)this;
        }

        public T addRule(Property property, String value) {
            addRule(StyleManager.stringifyEnum(property) + ": " + value + ";");
            return (T)this;
        }

        public T addRule(Property property, Color color) {
            addRule(StyleManager.stringifyEnum(property) + ": " + StyleManager.colorToString(color) + ";");
            return (T)this;
        }

        public AtRule build() {
            return new AtRule(this);
        }
    }
}
