package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.Locale;

/**
 * This class represents the Input-tag
 */
public class Input extends Element{
    private final String type;
    private final String id;
    private final String name;
    private final String label;
    private final String value;


    /**
     * Constructor used by Builder
     * @param builder
     */

    private Input(Builder builder){
        this.type = builder.type;
        this.id = builder.id;
        this.name = builder.name;
        this.label = builder.label;
        this.value = builder.value;
    }

    public String getType() {
        return type;
    }



    public String getName() {
        return name;
    }
    public String getLabel(){
        return label;
    }


    @Override
    public String toString() {
        String temp;
        if(!this.type.equalsIgnoreCase("submit")) {
            return "<label for=\"" + id + "\">" + label + "</label>\n" + "\n" +
                    "<input type=\"" + this.type + "\" id=\"" + this.id + "\" name=\"" + this.name + "\"> <br><br>";
        } else {
            return "<input type=\""+this.type + "\" value=\""+this.value+"\" >";
        }
    }

    /**
     * Builder class for Input-tag
     * Returns a Input-element
     */
    public static class Builder implements IBuilder {

        private String type;
        private String id;
        private String name;
        private String label;
        private String value = "";

        /**
         * Constructor creates an empty input with no field values
         */
        public Builder(){
            this.type = "text";
            this.id = "";
            this.name = "";
            this.label = "";
        }

        /**
         * Sets the input Id
         * @param id
         * @return
         */
        public Builder setId(String id){
            this.id = id;
            return this;
        }

        /**
         * Sets the input-name
         * @param name
         * @return
         */
        public Builder setName(String name){
            this.name = name;
            return this;
        }

        /**
         * Sets the label-content
         * @param label
         * @return
         */
        public Builder setLabel(String label){
            this.label = label;
            return this;
        }

        public Builder setValue(String value){
            this.value = value;
            return this;
        }

        public Builder setType(String type){
            this.type = type;
            return this;
        }
        /**
         * Returns an Input-object
         * @return
         */
        @Override
        public Input build(){
            Input input = new Input(this);
            return input;
        }

    }
}
