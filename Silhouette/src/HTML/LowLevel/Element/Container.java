package HTML.LowLevel.Element;

import java.util.ArrayList;
import java.util.List;

// Represents an HTML element that that holds one or more elements
// Such element is:
// Div, Article, Section, Aside, Footer, Header, Address, Span
public class Container extends ContainerElement {
    private String type;
    private List<Element> elementList;

    // Constructor: type implies the semantic tag
    public Container(ContainerBuilder builder){
    }

    public String getType() {
        return type;
    }
    public List<Element> getElementList(){
        return elementList;
    }
    public String elementListToString(List<Element> elementList){
        for(Element e : elementList){
            return e.toString();
        }
    }

    @Override
    public String toString(){
        return "<"+type + ">" + elementListToString(elementList) + "</"+type+">";
    }

    public static class ContainerBuilder{
        private String type;
        private List<Element> elementList = new ArrayList<>();

        public ContainerBuilder(){
        }
        public ContainerBuilder setType(String type){
            this.type = type;
            return this;
        }

        public ContainerBuilder listElement(Element e){
            elementList.add(e);
            return this;
        }
        public Container build(){
            Container container = new Container(this);
            verify();
            return container;
        }

        private void verify() {
        }


    }
}
