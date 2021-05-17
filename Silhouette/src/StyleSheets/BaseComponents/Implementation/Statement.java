package StyleSheets.BaseComponents.Implementation;

import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

public abstract class Statement {
    /**
     * An identifier can be anything that appears as a property, id, class, keyword value, and at-rule.
     */
    protected String identifier;

    protected ArrayList<String> rules;

    protected static String propertyToString(Property property) {
        String str = property.toString();

        return str.toLowerCase().replace('_', '-');
    }

    protected static String colorToString(Color color) {
        String str = color.toString();

        return str.toLowerCase();
    }
}
