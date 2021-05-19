package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Element {

    // char
    private static String accessKey;

    //boolean
    private static String draggable;
    private static String hidden = "false";
    private static String spellCheck;
    private static String contentEditable;
    //string
    private static String _class; //tag class name
    private static String id;
    private static String lang; //takes language code "en"/"fr"/"no"
    private static String dataAttribute; //is specified with data-*
    private static String dir = "ltr"; //chooses text direction, standard ltr
    private static String style;
    private static String title;

    //int
    private static String tabindex;

    // Key   (String) : Attribute name
    // Value (String) : Attribute value
    Map<String, String> attributes = new HashMap<>();

    public void addAttribute(String attribute, String value){
        if(attributes.containsKey(attribute)) {
            attributes.remove(attribute, value);
        }

        attributes.put(attribute, value);
    }

    // Classes and IDs
    public void applyClass(String className){}
    public void applyClasses(List<String> classNames){}
    public void applyId(String idName){}
    public void applyIds(List<String> idNames){}

    public static String getAccessKey() {
        return accessKey;
    }

    public static String getDraggable() {
        return draggable;
    }

    public static String getHidden() {
        return hidden;
    }

    public static String getSpellCheck() {
        return spellCheck;
    }

    public static String getContentEditable() {
        return contentEditable;
    }

    public static String get_class() {
        return _class;
    }

    public static String getId() {
        return id;
    }

    public static String getLang() {
        return lang;
    }

    public static String getDataAttribute() {
        return dataAttribute;
    }

    public static String getDir() {
        return dir;
    }

    public static String getStyle() {
        return style;
    }

    public static String getTitle() {
        return title;
    }

    public static String getTabindex() {
        return tabindex;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

}
