package StyleSheets.Values;

import StyleSheets.BaseComponents.Implementation.CSSManager;

public class Gradient {
    /**
     * Returns a linear or radial gradient as String
     * E.g Color.gradient("linear", "180degs", Color.RGB(), "yellow")
     * @param type "linear" or "radial"
     * @param values
     * @return String
     */
    public static String linearGradient(String type, String... values){
        String str = CSSManager.combineValuesWithSeparator(", ", values);

        return "linear-gradient(" + str + ")";
    }

    public static String radialGradient(String type, String... values){
        String str = CSSManager.combineValuesWithSeparator(", ", values);

        return "radial-gradient(" + str + ")";
    }
}
