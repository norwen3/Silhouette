package HTML.LowLevel.Element;

// Class that represents all elements that contain something
// Previously known as (OpenClosed)
public abstract class ContainerElement extends Element {

    //adds text to any element
    public void addText(String text){}

    //adds <p> tags to any element
    public void addParagraph(String text){}

    //will add an HTML.LowLevel.Element to OpenClosed container of any type
    public void addElement(Element item){}

    //adds a title <h1>, <h2> etc..
    public void addHeading(String level, String text){}

}
