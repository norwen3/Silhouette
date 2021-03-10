package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.ISource;

public class Picture extends ContainerElement implements ISource {
    // Constructor
    public Picture(){}

    // Methods
    public void addImage(Image image){}
    // @TODO: Remove this?
    // public void addImage(Source source){}

    @Override
    public void addSource(String media, String srcset) {

    }
}
