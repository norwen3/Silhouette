package StyleSheets;

import StyleSheets.BaseComponents.StyleManager;

public abstract class Gradient {

    /**
     * Returns a linear gradient as String.
     * The arguments
     * @param values
     * @return String
     */
    public static String linearGradient(String... values){
        String str = StyleManager.combineValuesWithSeparator(", ", values);

        return "linear-gradient(" + str + ")";
    }

    /**
     * Returns a radial gradient as String
     * E.g Color.gradient("linear", "180degs", ColorModel.RGB(), "yellow")
     * @param values
     * @return String
     */
    public static String radialGradient(String... values){
        String str = StyleManager.combineValuesWithSeparator(", ", values);

        return "radial-gradient(" + str + ")";
    }
}
