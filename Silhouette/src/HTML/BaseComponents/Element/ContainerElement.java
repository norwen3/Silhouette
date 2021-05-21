package HTML.BaseComponents.Element;

import java.util.List;

//
// Previously known as (OpenClosed)

/**
 * Abstract class that represents all elements that contain something
 * Elements with opening and closing tags
 * E.g. <body></body>
 * Class is not properly implemented due to time constraints
 */
public abstract class ContainerElement extends Element {
    private List<Element> elementList;

    //adds text to any element
    public void addText(String text){}

    //adds <p> tags to any element
    // @TODO: Remove? This is now a class
    //High-level API??
    public Paragraph addParagraph(String... text){
        String content = "";
        for (String s: text) {
            content += s + "\n";
        }
        return new Paragraph.Builder().setText(content).build();
    }

    //will add an HTML.LowLevel.Element to OpenClosed container of any type
    public void addElement(Element... item){}

    //High-level API
    //adds a title <h1>, <h2> etc..
    public Heading addHeading(String level, String text){
        return null;
    }


}
