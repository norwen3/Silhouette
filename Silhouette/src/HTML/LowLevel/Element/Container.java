package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.Builder;

import java.util.ArrayList;
import java.util.List;

// Represents an HTML element that that holds one or more elements
// Such element is:
// Div, Article, Section, Aside, Footer, Header, Address, Span
public class Container extends ContainerElement {
    private String type;
    private List<Element> elementList;

    // Constructor: type implies the semantic tag
    public Container(Builder builder){

        this.type = builder.type;
        this.elementList = builder.elementList;
    }
    public Container(){
        this.type = "div";

    }

    public String getType() {
        return type;
    }

    public String elementListToString(List<Element> elementList){
        if(elementList.isEmpty()){
            return null;
        }
        for(Element e: elementList){e.toString();}
        return elementListToString(elementList);
    }

    @Override
    public String toString(){
        return "<"+type+">" + elementListToString(elementList) + "</"+type+">";
    }


    public static class Builder implements HTML.LowLevel.ILowLevel.Builder {

        private String type;
        private List<Element> elementList;

        public Builder(String type){
            this.type = type;
            this.elementList = new ArrayList<>();
        }

        public Builder setContent(List<Element> elementList){
            this.elementList = elementList;
            return this;

        }
        public Builder setType(String type){
            this.type = type;
            return this;
        }

        @Override
        public Container build(){
            Container container = new Container(this);
            verify();
            return container;
        }




    }
}

/* ???
cant give a container a class or an id??
    <div class="pcStand">
        <div id="item-1">Apple</div>
        <div id="item-2">Windows</div>
    </div>
 */