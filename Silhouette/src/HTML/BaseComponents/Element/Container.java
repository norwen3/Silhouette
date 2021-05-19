package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * Represents an HTML element that that holds one or more elements
 * Such element is:
 * Div, Article, Section, Aside, Footer, Header, Address, Span
 */
public class Container extends ContainerElement {
    private String type;
    private List<Element> elementList;
    private Map<String,String> attributes;


    /**
     * Used by builder to create a Container-element
     * @param builder
     */

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


    /**
     * Takes a list of HTML-elements
     * @param elementList
     * Iterates over list and adds the textual content to a variable
     * and returns the list as a string
     * @return
     * Used by toString() method
     */
    private String elementListToString(List<Element> elementList){

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

    /**
     * Builder class for Container-Elements
     * Returns a Container that holds other HTML-elements
     */
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

        /**
         * Takes a pre-made list of elements,
         * @param elementList
         * This becomes the new content of the container
         * @return
         */
        public Builder setContent(List<Element> elementList){
            this.elementList = elementList;
            return this;

        }

        /**
         * Sets the type of the tag
         * @param type
         * type = div, head, body, footer, etc
         * @return
         */
        public Builder setType(String type){
            this.type = type;
            return this;
        }



        /**
         * Can take multiple Elements separated by a comma (,)
         * @param e
         * Adds any HTML-Element to this Container
         * @return
         */
        public Builder addElements(Element... e){
            for(Element i : e){
                this.elementList.add(i);
            }
            return this;
        }


        /**
         * Returns a Container-object
         * @return
         */
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