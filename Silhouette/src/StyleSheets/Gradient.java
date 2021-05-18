package StyleSheets;

import StyleSheets.BaseComponents.StyleManager;

/**
 * Helping class to control and simplify linear and radial gradients.
 * Every method in this class is static and returns a string that can be used with properties.
 */
public abstract class Gradient {

    /**
     * Returns a linear gradient as String.
     * It takes String varargs as arguments that specifies the attributes of the gradient.
     * @param values attributes of the linear gradient
     * @return String
     */
    public static String linearGradient(String... values){
        String str = StyleManager.combineValuesWithSeparator(", ", values);

        return "linear-gradient(" + str + ")";
    }

    /**
     * Returns a radial gradient as String.
     * It takes String varargs as arguments that specifies the attributes of the gradient.
     * @param values attributes of the radial gradient
     * @return String
     */
    public static String radialGradient(String... values){
        String str = StyleManager.combineValuesWithSeparator(", ", values);

        return "radial-gradient(" + str + ")";
    }
}
