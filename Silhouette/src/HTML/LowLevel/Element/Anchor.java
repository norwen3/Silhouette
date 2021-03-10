package HTML.LowLevel.Element;

// Represents an anchor element (url link)
// Can instantiate anchor OR use static method
public class Anchor extends ContainerElement {

    public Anchor(){}
    public Anchor(String text, String url){}

    public static String setLink(String text, String url){
        // returns <a href="url">text</a>
        return null;
    }

    public void setUrl(){}
}
