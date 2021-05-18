package StyleSheets.BaseComponents.Implementation;

import StyleSheets.Values.AtRuleType;
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

    private static String stringToLowerCaseAndReplaceDashes(String str) {
        return str.toLowerCase().replace('_', '-');
    }

    public static String stringifyEnum(Property property) {
        return stringToLowerCaseAndReplaceDashes(property.toString());
    }

    public static String stringifyEnum(AtRuleType atRuleType) {
        return stringToLowerCaseAndReplaceDashes(atRuleType.toString());
    }

    public static String stringifyEnum(Color color) {
        return stringToLowerCaseAndReplaceDashes(color.toString());
    }

    public static String stringifyEnum(Unit unit) {
        return stringToLowerCaseAndReplaceDashes(unit.toString());
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
