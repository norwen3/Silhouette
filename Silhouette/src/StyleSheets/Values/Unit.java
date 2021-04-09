package StyleSheets.Values;

/**
 * Allows for java manipulation since the methods take a number value.
 */
public abstract class Unit {
    // Ambiguous
    public static String generic(int value, String unit) {

    }

    // Absolute lengths
    public static String pixels(int value) {
        return value + "px";
    }
    public static String cm(int value) {
        return value + "cm";
    }
    public static String mm(int value) {
        return value + "mm";
    }
    public static String in(int value) {
        return value + "in";
    }
    public static String pt(int value) {
        return value + "pt";
    }
    public static String pc(int value) {
        return value + "pc";
    }

    // Relative lengths

    public static String em(int value) {
        return value + "em";
    }
    public static String ex(int value) {
        return value + "ex";
    }
    public static String ch(int value) {
        return value + "ch";
    }
    public static String rem(int value) {
        return value + "rem";
    }
    public static String vw(int value) {
        return value + "vw";
    }
    public static String vh(int value) {
        return value + "vh";
    }
    public static String vmin(int value) {
        return value + "vmin";
    }
    public static String vmax(int value) {
        return value + "vmax";
    }
    public static String percent(int value) {
        return value + "%";
    }

}
