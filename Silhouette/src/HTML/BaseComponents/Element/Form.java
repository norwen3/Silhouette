package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

/**
 * This class represents a form-tag
 */
public class Form extends ContainerElement {
    private FieldSet fieldSet;
    private String method;
    private String action;

    /**
     * Constructor used by builder
     * @param builder
     */
    private Form(Builder builder){

        this.fieldSet = builder.fieldSet;
        this.method = builder.method;
        this.action = builder.action;

    }

    public FieldSet getFieldSet(){
        return fieldSet;
    }

    public String getMethod() {
        return method;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString(){
        return "<form action=\""+action + "\">\n" + fieldSet + "\n</form";
    }

    /**
     * Builder class for Form
     * Outputs Form-element
     */
    public static class Builder implements IBuilder {
        private FieldSet fieldSet;
        private String method;
        private String action;

        public Builder(){
            this.fieldSet = null;
            this.method="";
            this.action="";
        }

        /**
         *
         * @param fieldSet
         * @return
         */
        public Builder setFieldSet(FieldSet fieldSet){
            this.fieldSet = fieldSet;
            return this;
        }

        /**
         * sets get or post for Form
         * @param method
         * @return
         */

        public Builder setMethod(String method){

            this.method = method;
            return this;
        }


        /**
         * sets action URL for form
         * @param action
         * @return
         */
        public Builder setAction(String action){
            this.action = action;
            return this;
        }


        /**
         * Returns a Form-object
         * @return
         */
        @Override
        public Form build(){
            Form form = new Form(this);
            verify();
            return form;
        }



    }
}
