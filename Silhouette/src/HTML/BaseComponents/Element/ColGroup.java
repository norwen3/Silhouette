package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a new ColGroup Element
 */
public class ColGroup extends ContainerElement{

    private int span;
    private String style;
    private Map<String, String> attributes;
    private List<String> columns;

    private ColGroup(Builder builder){
        this.span = builder.span;
        this.style = builder.style;
        this.attributes = builder.attributes;
        this.columns = builder.columns;
    }

    public int getSpan() {
        return span;
    }

    public String getColStyle() {
        return style;
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public List<String> getColumns() {
        return columns;
    }

    public String columnIterator(){
        String output = "";
        for(String s:getColumns()){
            output += "<col " +s + " >\n";
        }
        return output;
    }

    public String toString(){
        return "<colgroup>\n" + columnIterator() + "</colgroup>";
    }

    /**
     * Builder class for ColGroup
     * Returns a colgroup element with its columns
     */
    public static class Builder implements IBuilder{
        private int span;
        private String style;
        private Map<String, String> attributes;
        private List<String> columns;



        /**
         * The area that the colgroup applies to
         * @param span
         * The style that applies to this colgroup
         * @param style
         * @return
         */
        public Builder addColumn(int span, String style){
            this.span = span;
            this.style = style;
            this.attributes = new HashMap<>();
            this.columns = new ArrayList<>();
            String s = "span=\""+span+"\" style=\"" + style + "\"";
            this.columns.add(s);
            return this;
        }

        // Style (CSS)

        /**
         * Add more styles to the colgroup
         * @param styles
         * @return
         */
        public Builder addColumns(String... styles){
            for(String s : styles){
                this.columns.add(s);
            }
            return this;
        }

        /**
         * Returns the colgroup-element
         * @return
         */
        @Override
        public ColGroup build() {
            ColGroup cg = new ColGroup(this);
            verify();
            return cg;
        }


    }
}

/*
<table>
  <colgroup>
    <col span="2" style="background-color:red">
    <col style="background-color:yellow">
  </colgroup>
  <tr>
    <th>ISBN</th>
    <th>Title</th>
    <th>Price</th>
  </tr>
  <tr>
    <td>3476896</td>
    <td>My first HTML</td>
    <td>$53</td>
  </tr>
</table>
 */