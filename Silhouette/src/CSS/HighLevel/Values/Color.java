package CSS.HighLevel.Values;

import java.util.Arrays;
import java.util.Iterator;

public class Color {
    // Color

    /**
     * Returns an HSLA value as String.
     * @param hue Hue
     * @param saturation Saturation in percent
     * @param lightness Lightness in percent
     * @param alpha Alpha
     * @return String
     */
    public static String HSLA(float hue, float saturation, float lightness, float alpha){
        return "hsla(" + hue + ", " + saturation + ", " + lightness + ", " + alpha + ")";
    }

    /**
     * Returns an HSL value as String
     * @param hue Hue
     * @param saturation Saturation in percent
     * @param lightness Lightness in percent
     * @return String
     */
    public static String HSL(float hue, float saturation, float lightness){
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
     * Returns Hex value as String
     * @param hexCode
     * @return String
     */
    public static String Hex(String hexCode){
        if (!hexCode.contains("#")){
            return "#" + hexCode;
        }
        return hexCode;
    }


}
