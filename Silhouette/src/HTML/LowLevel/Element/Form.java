package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.Builder;

public class Form extends ContainerElement {
    private FieldSet fieldSet;
    private String method;
    private String action;

    public Form(Builder builder){

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


    public static class Builder implements HTML.LowLevel.ILowLevel.Builder {

        private FieldSet fieldSet;
        private String method;
        private String action;

        public Builder(){}

        /**
         *
         * @param fieldSet
         * @return
         */
        public Builder setFieldSet(FieldSet fieldSet){
            this.fieldSet = fieldSet;
            return this;
        }


        //sets get or post

        /**
         *
         * @param method
         * @return
         */

        public Builder setMethod(String method){

            this.method = method;
            return this;
        }

        //sets action URL for form

        /**
         *
         * @param action
         * @return
         */
        public Builder setAction(String action){
            this.action = action;
            return this;
        }

        /**
         *
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
