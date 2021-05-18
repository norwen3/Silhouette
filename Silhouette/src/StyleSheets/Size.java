package StyleSheets;

import StyleSheets.BaseComponents.StyleManager;
import StyleSheets.Values.Unit;
/**
 * Helping class to control and simplify sizing.
 * Can be useful with number manipulation as each methods take an integer value used to determine the size.
 * Every method in this class is static and returns a string that can be used with properties.
 */
public abstract class Size {

    /**
     * Converts sizes to string with any given unit.
     * @param value size as an integer
     * @param unit unit of measurement as String
     * @return String
     */
    public static String generic(int value, String unit) {
        return value + unit;
    }

    /**
     * Converts sizes to string with any given unit.
     * @param value size as an integer
     * @param unit unit of measurement as Unit enum
     * @return String
     */
    public static String generic(int value, Unit unit) {
        return value + StyleManager.unitToString(unit);
    }

    /**
     * Converts absolute sizes to string in pixels.
     * @param value size as an integer
     * @return String
     */
    public static String pixels(int value) {
        return value + StyleManager.unitToString(Unit.PX);
    }

    /**
     * Converts absolute sizes to string in centimeters.
     * @param value size as an integer
     * @return String
     */
    public static String cm(int value) {
        return value + StyleManager.unitToString(Unit.CM);
    }

    /**
     * Converts absolute sizes to string in millimeters.
     * @param value size as an integer
     * @return String
     */
    public static String mm(int value) {
        return value + StyleManager.unitToString(Unit.MM);
    }

    /**
     * Converts absolute sizes to string in inches.
     * @param value size as an integer
     * @return String
     */
    public static String in(int value) {
        return value + StyleManager.unitToString(Unit.IN);
    }

    /**
     * Converts absolute sizes to string in points.
     * @param value size as an integer
     * @return String
     */
    public static String pt(int value) {
        return value + StyleManager.unitToString(Unit.PT);
    }

    /**
     * Converts absolute sizes to string in picas.
     * @param value size as an integer
     * @return String
     */
    public static String pc(int value) {
        return value + StyleManager.unitToString(Unit.PC);
    }

    /**
     * Converts relative sizes to string in em.
     * @param value size as an integer
     * @return String
     */
    public static String em(int value) {
        return value + StyleManager.unitToString(Unit.EM);
    }

    /**
     * Converts relative sizes to string in ex.
     * @param value size as an integer
     * @return String
     */
    public static String ex(int value) {
        return value + StyleManager.unitToString(Unit.EX);
    }

    /**
     * Converts relative sizes to string in ch.
     * @param value size as an integer
     * @return String
     */
    public static String ch(int value) {
        return value + StyleManager.unitToString(Unit.CH);
    }

    /**
     * Converts relative sizes to string in rem.
     * @param value size as an integer
     * @return String
     */
    public static String rem(int value) {
        return value + StyleManager.unitToString(Unit.REM);
    }

    /**
     * Converts relative sizes to string in vw.
     * @param value size as an integer
     * @return String
     */
    public static String vw(int value) {
        return value + StyleManager.unitToString(Unit.VW);
    }

    /**
     * Converts relative sizes to string in vh.
     * @param value size as an integer
     * @return String
     */
    public static String vh(int value) {
        return value + StyleManager.unitToString(Unit.VH);
    }

    /**
     * Converts relative sizes to string in vmin.
     * @param value size as an integer
     * @return String
     */
    public static String vmin(int value) {
        return value + StyleManager.unitToString(Unit.VMIN);
    }

    /**
     * Converts relative sizes to string in vmax.
     * @param value size as an integer
     * @return String
     */
    public static String vmax(int value) {
        return value + StyleManager.unitToString(Unit.VMAX);
    }

    /**
     * Converts relative sizes to string in percent.
     * @param value size as an integer
     * @return String
     */
    public static String percent(int value) {
        return value + StyleManager.unitToString(Unit.PERCENT);
    }

}
