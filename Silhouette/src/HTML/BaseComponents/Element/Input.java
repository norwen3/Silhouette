package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Input extends Element{
    private final String type;
    private final String id;
    private final String name;
    private final String label;

    public Input(Builder builder){
        this.type = builder.type;
        this.id = builder.id;
        this.name = builder.name;
        this.label = builder.label;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getLabel(){
        return label;
    }


    @Override
    public String toString() {
        return "<label for=\""+id+"\">" + label + "</label>\n"+"\n" +
                "<input type=\""+this.type+"\" id=\"" + this.id + "\" name=\""+ this.name + "\"> <br><br>";
    }

    public static class Builder implements IBuilder {

        private String type;
        private String id = "";
        private String name ="";
        private String label = "";

        public Builder(String type, String id, String name, String label){
            this.type = type;
            this.id = id;
            this.name = name;
            this.label = label;
        }

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLabel(String label){
            this.label = label;
            return this;
        }


        @Override
        public Input build(){
            Input input = new Input(this);
            verify();
            return input;
        }

    }
}
