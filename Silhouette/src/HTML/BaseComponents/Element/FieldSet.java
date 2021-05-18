package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


// Represents a FieldSet elements that contain one or more fields (input tags)
public class FieldSet extends ContainerElement {
    private List<Input> inputList;
    private String legend;
    private Map<String,String> attributes;
    private String content;

    private FieldSet(Builder builder){
        this.inputList = builder.inputList;
        this.legend = builder.legend;
        this.attributes = builder.attributes;
        this.content = builder.content;
    }

    public void addTextArea(ContainerElement element, Map<String, String> attributes, String content){}

    @Override
    public String toString(){
        return "<fieldset>\n\t" + "<legend>" +legend + "</legend>\n"+ inputList.toString() + "<\n/fieldset>";
    }


    public static class Builder implements IBuilder {
        private List<Input> inputList;

        private String legend;
        private Map<String, String> attributes;
        private String content;


        public Builder(){
            this.inputList = new ArrayList<>();
        }

        public Builder setInputs(Input... inputs){
            for(Input i: inputs){
                this.inputList.add(i);
            }
            return this;
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
