package HTML.LowLevel.Element;

import java.util.List;

// Class that represents all elements that contain something
// Previously known as (OpenClosed)
public abstract class ContainerElement extends Element {
    private List<Element> elementList;

    //adds text to any element
    public void addText(String text){}

    //adds <p> tags to any element
    // @TODO: Remove? This is now a class
    //High-level API??
    public Paragraph addParagraph(String... text){
        return null;
    }

    //will add an HTML.LowLevel.Element to OpenClosed container of any type
    public void addElement(Element... item){}

    //High-level API
    //adds a title <h1>, <h2> etc..
    public Heading addHeading(int level, String text){
        return null;
    }


}
