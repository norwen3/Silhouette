package StyleSheets.BaseComponents;

import StyleSheets.BaseComponents.Implementation.Statement;

import java.util.ArrayList;
import java.util.Arrays;

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

    private AtRule(Builder builder) {
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

    public static class Builder {
        public String identifier = "@";

        public ArrayList<String> rules = new ArrayList<>();

        public ArrayList<RuleSet> ruleSets = new ArrayList<>();

        public Builder setIdentifier(String keyword, String rule) {
            identifier = "@" + keyword + " " + rule;
            return this;
        }

        public Builder addRuleSet(RuleSet ruleSet) {
            ruleSets.add(ruleSet);
            return this;
        }

        public Builder addRule(String css) {
            rules.add(css);
            return this;
        }

        public Builder addRule(String property, String value) {
            addRule(property + ": " + value + ";");
            return this;
        }

        public AtRule build() {
            return new AtRule(this);
        }
    }
}
