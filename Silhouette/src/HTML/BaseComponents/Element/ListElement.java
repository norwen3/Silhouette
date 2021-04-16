package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class ListElement extends ContainerElement {

    private List<String> items;
    private Boolean isOrdered;

    public ListElement(Builder builder) {
        this.items = builder.items;
        this.isOrdered = builder.isOrdered;
    }


    public List<String> getItems() {
        return items;
    }

    public Boolean getOrdered() {
        return isOrdered;
    }

    private String listIterator(){
        String s = "";
        for(String i : items){
            s += "<li>" + i + "</li>\n";
        }
        return s;
    }

    public String toString(){
        String s = "";
        if(isOrdered == true){
            s = "<ol>\n" + listIterator() + "</ol>\n";
        } else{
            s = "<ul>\n" + listIterator() + "<ul>\n";
        }
        return s;
    }

    public static class Builder implements IBuilder{
        private List<String> items;
        private Boolean isOrdered;

        public Builder(Boolean isOrdered){
            this.items = new ArrayList<>();
            this.isOrdered = isOrdered;
        }

        //adds listItem to ListElement
        public Builder addItems(String... item){
            for(String s : item){
                this.items.add(s);
            }
            return this;
        }


        public Builder addElements(Element... elements){
            for(Element e: elements){
                this.items.add(e.toString());
            }
            return this;
        }


        @Override
        public ListElement build() {
            ListElement le = new ListElement(this);
            verify();
            return le;
        }

    }
}
