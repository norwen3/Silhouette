package StyleSheets.BaseComponents;

import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Represents any rule set or at-rule.
 */
public abstract class Statement {
    /**
     * An identifier is anything that appears as a property, id, class, keyword value or at-rule.
     */
    protected String identifier;

    /**
     * A list of rules of arbitrary length.
     */
    protected ArrayList<String> rules;
}
