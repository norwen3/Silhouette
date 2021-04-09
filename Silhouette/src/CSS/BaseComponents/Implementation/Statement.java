package CSS.BaseComponents.Implementation;

import java.util.ArrayList;

public abstract class Statement {
    /**
     * An identifier can be anything that appears as a property, id, class, keyword value, and at-rule.
     */
    public String identifier;

    public ArrayList<String> rules = new ArrayList<>();

    public void addRule(String css){
        rules.add(css);
    }

    public void addRule(String property, String value){
        addRule(property + ": " + value + ";");
    }
}
