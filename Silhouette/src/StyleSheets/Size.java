package StyleSheets;

import StyleSheets.BaseComponents.StyleManager;
import StyleSheets.Values.Unit;

/**
 * Allows for java manipulation since the methods take a number value.
 */
public abstract class Size {

    // Ambiguous

    public static String generic(int value, String unit) {
        return value + unit;
    }
    public static String generic(int value, Unit unit) {
        return value + StyleManager.unitToString(unit);
    }

    // Absolute lengths

    public static String pixels(int value) {
        return value + StyleManager.unitToString(Unit.PX);
    }
    public static String cm(int value) {
        return value + StyleManager.unitToString(Unit.CM);
    }
    public static String mm(int value) {
        return value + StyleManager.unitToString(Unit.MM);
    }
    public static String in(int value) {
        return value + StyleManager.unitToString(Unit.IN);
    }
    public static String pt(int value) {
        return value + StyleManager.unitToString(Unit.PT);
    }
    public static String pc(int value) {
        return value + StyleManager.unitToString(Unit.PC);
    }

    // Relative lengths

    public static String em(int value) {
        return value + StyleManager.unitToString(Unit.EM);
    }
    public static String ex(int value) {
        return value + StyleManager.unitToString(Unit.EX);
    }
    public static String ch(int value) {
        return value + StyleManager.unitToString(Unit.CH);
    }
    public static String rem(int value) {
        return value + StyleManager.unitToString(Unit.REM);
    }
    public static String vw(int value) {
        return value + StyleManager.unitToString(Unit.VW);
    }
    public static String vh(int value) {
        return value + StyleManager.unitToString(Unit.VH);
    }
    public static String vmin(int value) {
        return value + StyleManager.unitToString(Unit.VMIN);
    }
    public static String vmax(int value) {
        return value + StyleManager.unitToString(Unit.VMAX);
    }
    public static String percent(int value) {
        return value + StyleManager.unitToString(Unit.PERCENT);
    }

}
