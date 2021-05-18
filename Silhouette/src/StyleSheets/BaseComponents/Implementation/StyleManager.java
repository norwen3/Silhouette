package StyleSheets.BaseComponents.Implementation;

import StyleSheets.Values.Color;
import StyleSheets.Values.Property;
import StyleSheets.Values.Unit;

import java.util.Arrays;
import java.util.Iterator;

public abstract class StyleManager {
    public static String combineValuesWithSeparator(String separator, String[] values) {
        StringBuilder str = new StringBuilder();

        Iterator<String> valueIterator = Arrays.asList(values).iterator();
        while (valueIterator.hasNext()){

            str.append(valueIterator.next());

            if (valueIterator.hasNext()){
                str.append(separator);
            }
        }

        return str.toString();
    }

    public static String propertyToString(Property property) {
        String str = property.toString();

        return str.toLowerCase().replace('_', '-');
    }

    public static String colorToString(Color color) {
        String str = color.toString();

        return str.toLowerCase();
    }

    public static String unitToString(Unit unit) {
        String str = unit.toString().toLowerCase();

        if (str.equals("percent")) {
            return "%";
        }

        return str;
    }
}
