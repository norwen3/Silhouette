package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Represents an HTML element that that holds one or more elements
// Such element is:
// Div, Article, Section, Aside, Footer, Header, Address, Span
public class Container extends ContainerElement {
    private String type;
    private List<Element> elementList;
    private Map<String,String> attributes;

    // Constructor: type implies the semantic tag
    private Container(Builder builder){

        this.type = builder.type;
        this.elementList = builder.elementList;
        this.attributes = builder.attributes;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getType() {
        return type;
    }

    public String elementListToString(List<Element> elementList){
        String content = "";

        for(Element e: elementList) {
            content += e.toString() +"\n";
        }
        return content;
    }

    @Override
    public String toString(){
        return "<"+this.type+">\n" + elementListToString(this.elementList)
                + "</"+this.type+">";
    }

    public static class Builder implements IBuilder {
        private String type;
        private List<Element> elementList;
        private Map<String,String> attributes;
        private String Class;

        public Builder(){
            this.type = "div";
            this.elementList = new ArrayList<>();
            this.attributes = new HashMap<>();
        }

        public Builder setContent(List<Element> elementList){
            this.elementList = elementList;
            return this;

        }
        //type = div, head, body, footer, etc
        public Builder setType(String type){
            this.type = type;
            return this;
        }



        /**
         *
         * @param e
         * @return
         */
        public Builder addElements(Element... e){
            for(Element i : e){
                this.elementList.add(i);
            }
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