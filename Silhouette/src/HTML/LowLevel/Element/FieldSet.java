package HTML.LowLevel.Element;

import java.util.List;
import java.util.Map;

// Represents a FieldSet elements that contain one or more fields (input tags)
public class FieldSet extends ContainerElement {
    private final List<Input> inputList;
    private String legend;
    private Map<String,String> attributes;
    private String content;

    public FieldSet(FieldSetBuilder builder){
        this.inputList = builder.inputList;
    }

    public void addTextArea(ContainerElement element, Map<String, String> attributes, String content){}

    @Override
    public String toString(){
        return "<fieldset>\n\t" + "<legend>" +legend + "</legend>\n"+ inputList + "<\n/fieldset>";
    }


    public static class FieldSetBuilder{
        private final List<Input> inputList;
        private String legend;
        private Map<String, String> attributes;
        private String content;

        public FieldSetBuilder(List<Input> inputList){
            this.inputList = inputList;
        }

        public FieldSetBuilder addInput(Input input){
            this.inputList.add(input);
            return this;
        }
        public FieldSetBuilder setLegend(String legend){
            this.legend = legend;
            return this;
        }
        public FieldSetBuilder setAttributes(Map<String, String> attributes){
            this.attributes = attributes;
            return this;
        }
        public FieldSetBuilder setContent(String content){
            this.content = content;
            return this;
        }

        public FieldSet build(){
            FieldSet fieldSet = new FieldSet(this);
            verify();
            return fieldSet;
        }

        private void verify() {
        }
    }
}
