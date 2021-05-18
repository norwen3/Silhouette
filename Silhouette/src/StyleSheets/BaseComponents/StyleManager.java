package StyleSheets.BaseComponents;

import StyleSheets.Values.AtRuleType;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;
import StyleSheets.Values.Unit;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    private static String formatStyleData(String str) {
        return str.toLowerCase().replace('_', '-');
    }

    public static String stringifyEnum(Property property) {
        return formatStyleData(property.toString());
    }

    public static String stringifyEnum(AtRuleType atRuleType) {
        return formatStyleData(atRuleType.toString());
    }

    public static String stringifyEnum(Color color) {
        return formatStyleData(color.toString());
    }

    public static String stringifyEnum(Unit unit) {
        return formatStyleData(unit.toString());
    }

    public static String unitToString(Unit unit) {
        String str = unit.toString().toLowerCase();

        if (str.equals("percent")) {
            return "%";
        }

        return str;
    }

    public static String readFile(String filePath) {
        String content = null;
        try {
            content = Files.readString(Paths.get(filePath), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
