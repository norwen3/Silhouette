package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Represents a FieldSet elements that contain one or more fields (input tags)
 */
public class FieldSet extends ContainerElement {
    private List<Input> inputList;
    private String legend;
    private Map<String,String> attributes;
    private String content;

    /**
     * Constructor used by Builder class
     * @param builder
     */

    private FieldSet(Builder builder){
        this.inputList = builder.inputList;
        this.legend = builder.legend;
        this.attributes = builder.attributes;
        this.content = builder.content;
    }

    public List<Input> getInputList() {
        return inputList;
    }

    public String getLegend() {
        return legend;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getContent() {
        return content;
    }


    /**
     * Not yet implemented
     * @param element
     * @param attributes
     * @param content
     * Should add an area with text to a field-set
     */

    public void addTextArea(ContainerElement element, Map<String, String> attributes, String content){}

    @Override
    public String toString(){
        return "<fieldset>\n\t" + "<legend>" +legend + "</legend>\n"+ inputList.toString() + "<\n/fieldset>";
    }


    /**
     * Builder class for FieldSet
     * Returns a FieldSet-element
     */
    public static class Builder implements IBuilder {
        private List<Input> inputList;

        private String legend;
        private Map<String, String> attributes;
        private String content;


        /**
         * Constructs an empty FieldSet Builder
         */
        public Builder(){
            this.inputList = new ArrayList<>();
            this.attributes = new HashMap<>();
            this.content="";
        }

        /**
         * Takes one or more input fields
         * @param inputs
         * Adds the fields to the inputList
         * @return
         */
        public Builder setInputs(Input... inputs){
            for(Input i: inputs){
                this.inputList.add(i);
            }
            return this;
        }

        /**
         * Sets the legend text for the FieldSet
         * @param legend
         * @return
         */
        public Builder setLegend(String legend){
            this.legend = legend;
            return this;
        }

        /**
         * Takes a pre-made map of attributes
         * @param attributes
         * Sets the attributes-map of the object equal param
         * @return
         */
        public Builder setAttributes(Map<String, String> attributes){
            this.attributes = attributes;
            return this;
        }

        /**
         * Sets the textual content of the FieldSet
         * @param content
         * @return
         */
        public Builder setContent(String content){
            this.content = content;
            return this;
        }


        /**
         * Returns the FieldSet-element
         * @return
         */
        @Override
        public FieldSet build(){
            FieldSet fieldSet = new FieldSet(this);
            verify();
            return fieldSet;
        }



    }
}
