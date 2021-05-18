package StyleSheets.BaseComponents;

import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class Statement {
    /**
     * An identifier can be anything that appears as a property, id, class, keyword value, and at-rule.
     */
    protected String identifier;

    protected ArrayList<String> rules;
}
