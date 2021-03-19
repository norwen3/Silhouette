package CSS.LowLevel.Style;

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
public class AtRule {

    // Instance variables

    String atRule;
    ArrayList<RuleSet> listOfRuleSets = new ArrayList<>();

    // Constructors

    public AtRule(String keyword, String rule){
        // @keyframes, @media
        atRule = "@" + keyword + " " + rule;
    }

    // Methods

    public void addRuleSet(RuleSet ruleSet){
        listOfRuleSets.add(ruleSet);
    }

    public void addRuleSets(RuleSet... ruleSets){
        for (RuleSet ruleSet : ruleSets){
            listOfRuleSets.add(ruleSet);
        }
    }
}
