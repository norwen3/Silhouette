package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.List;
import java.util.Map;

public class ColGroup extends ContainerElement{

    private int span;
    private String style;
    private Map<String, String> attributes;
    private List<String> columns;

    public ColGroup(Builder builder){
        this.span = builder.span;
        this.style = builder.style;
        this.attributes = builder.attributes;
        this.columns = builder.columns;
    }

    public String columnIterator(){
        String output = "";
        for(String s:columns){
            output += "<col " +s + " >\n";
        }
        return output;
    }

    public String toString(){
        return "<colgroup>\n" + columnIterator() + "</colgroup>";
    }


    public static class Builder implements IBuilder{
        private int span;
        private String style;
        private Map<String, String> attributes;
        private List<String> columns;

        public Builder(int span, String style){
            this.span = span;
            this.style = style;
        }
        // Span only and Style (CSS)
        public Builder addColumn(int span, String style){
            String s = "span=\""+span+"\" style=\"" + style + "\"";
            this.columns.add(s);
            return this;
        }

        // Style (CSS)
        public Builder addColumns(String... styles){
            for(String s : styles){
                this.columns.add(s);
            }
            return this;
        }

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