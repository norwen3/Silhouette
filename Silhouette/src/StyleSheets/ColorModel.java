package StyleSheets;

/**
 * Helping class to control and simplify various types of coloring methods.
 * Every method in this class is static and returns a string that can be used with properties.
 */
public abstract class ColorModel {

    /**
     * Returns an HSLA value as String.
     * @param hue Hue
     * @param saturation Saturation in percent
     * @param lightness Lightness in percent
     * @param alpha Alpha
     * @return String
     */
    public static String HSLA(float hue, float saturation, float lightness, float alpha) {
        return "hsla(" + hue + ", " + saturation + ", " + lightness + ", " + alpha + ")";
    }

    /**
     * Returns an HSL value as String
     * @param hue Hue
     * @param saturation Saturation in percent
     * @param lightness Lightness in percent
     * @return String
     */
    public static String HSL(float hue, float saturation, float lightness) {
        return "hsl(" + hue + ", " + saturation + ", " + lightness + ")";
    }

    /**
     * Returns an RGB value as String
     * @param red
     * @param green
     * @param blue
     * @return String
     */
    public static String RGB(int red, int green, int blue){
        return "rgb(" + red + ", " + green + ", " + blue + ")";
    }

    /**
     * Checks validity of Hex, and then returns value as String.
     * @param hexCode
     * @return String
     */
    public static String Hex(String hexCode){

        if (!hexCode.contains("#") && hexCode.length() == 6){
            return "#" + hexCode;
        } else if (!hexCode.contains("#") && hexCode.length() != 6) {
            return "#" + "FFFFFF";
        }

        return hexCode;
    }


}
