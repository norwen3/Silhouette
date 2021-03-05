package HTML.LowLevel.Element;

import java.util.Map;

// Represents a FieldSet elements that contain one or more fields (input tags)
public class FieldSet extends ContainerElement {

    // Adds a field (e.g. <input>)
    public void addField(EmptyElement element, Map attributes){}

    public void addTextArea(ContainerElement element, Map Attributes, String content){}

    public void addLegend(String legend){}

    public void addLabel(String label){}
}
