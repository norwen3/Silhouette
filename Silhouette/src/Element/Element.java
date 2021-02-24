package Element;

import java.util.HashMap;
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


    Map<String, String> attributes = new HashMap<>();



    public void setAttribute(String attribute, String value){
        if(attributes.containsKey(attribute)) {
            attributes.remove(attribute, value);
        }

        attributes.put(attribute, value);

    }

}
