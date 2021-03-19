package HTML.LowLevel.Element;

public class Heading extends ContainerElement{
    public Heading(String level, String text){
        return "<h" + level + "> " + text + " <h" + level + ">";
    }
}
