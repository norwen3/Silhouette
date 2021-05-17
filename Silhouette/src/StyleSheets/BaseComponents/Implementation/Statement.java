package StyleSheets.BaseComponents.Implementation;

import java.util.ArrayList;

public abstract class Statement {
    /**
     * An identifier can be anything that appears as a property, id, class, keyword value, and at-rule.
     */
    protected String identifier;

    protected ArrayList<String> rules;
}
