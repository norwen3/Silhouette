package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.Builder;

import java.util.List;
import java.util.Map;


// Represents a FieldSet elements that contain one or more fields (input tags)
public class FieldSet extends ContainerElement {
    private List<Input> inputList;
    private String legend;
    private Map<String,String> attributes;
    private String content;

    public FieldSet(Builder builder){
        this.inputList = builder.inputList;
        this.legend = builder.legend;
        this.attributes = builder.attributes;
        this.content = builder.content;
    }

    public void addTextArea(ContainerElement element, Map<String, String> attributes, String content){}

    @Override
    public String toString(){
        return "<fieldset>\n\t" + "<legend>" +legend + "</legend>\n"+ inputList + "<\n/fieldset>";
    }


    public static class Builder implements HTML.LowLevel.ILowLevel.Builder {
        private List<Input> inputList;
        private String legend;
        private Map<String, String> attributes;
        private String content;


        public Builder(List<Input> inputList){
            this.inputList = inputList;
        }


        public Builder setLegend(String legend){
            this.legend = legend;
            return this;
        }
        public Builder setAttributes(Map<String, String> attributes){
            this.attributes = attributes;
            return this;
        }
        public Builder setContent(String content){
            this.content = content;
            return this;
        }

        @Override
        public FieldSet build(){
            FieldSet fieldSet = new FieldSet(this);
            verify();
            return fieldSet;
        }


    }
}
