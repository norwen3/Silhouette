package HTML.LowLevel.Element;

public class Form extends ContainerElement {
    private FieldSet fieldSet;
    private String type;
    private String action;

    public Form(FormBuilder builder){
    }

    public FieldSet getFieldSet(){
        return fieldSet;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action;
    }

    @Override
    public String toString(){
        return "<form action=\""+action + "\">\n" + fieldSet + "\n</form";
    }

    public static class FormBuilder{
        private FieldSet fieldSet;
        private String method;
        private String action;

        public FormBuilder(){}

        /**
         *
         * @param fieldSet
         * @return
         */
        public FormBuilder setFieldSet(FieldSet fieldSet){
            this.fieldSet = fieldSet;
            return this;
        }


        //sets get or post

        /**
         *
         * @param type
         * @return
         */
        public FormBuilder setMethod(String type){
            this.method = method;
            return this;
        }

        //sets action URL for form

        /**
         *
         * @param action
         * @return
         */
        public FormBuilder setAction(String action){
            this.action = action;
            return this;
        }

        /**
         *
         * @return
         */
        public Form build(){
            Form form = new Form(this);
            verify();
            return form;
        }

        private void verify() {
        }
    }
}
