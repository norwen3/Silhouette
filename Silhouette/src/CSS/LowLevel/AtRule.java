package CSS.LowLevel;

import CSS.HighLevel.Implementation.Statement;
import CSS.HighLevel.RuleSet;

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

    public ArrayList<RuleSet> ruleSets = new ArrayList<>();

    // Constructors

    public AtRule(String keyword, String rule){
        // @keyframes, @media
        identifier = "@" + keyword + " " + rule;
    }

    // Methods

    public void addRuleSet(RuleSet ruleSet){
        ruleSets.add(ruleSet);
    }

    public void addRuleSets(RuleSet... ruleSets){
        this.ruleSets.addAll(Arrays.asList(ruleSets));
    }
}
