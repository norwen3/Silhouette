package HTML.LowLevel.Element;

public class Input {
    private final String type;
    private final String id;
    private final String name;
    private final String label;

    public Input(InputBuilder builder){
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

    public static class InputBuilder{
        private final String type;
        private final String id;
        private final String name;
        private final String label;

        public InputBuilder(String type, String id, String name, String label){
            this.type = type;
            this.id = id;
            this.name = name;
            this.label = label;
        }

        public Input build(){
            Input input = new Input(this);
            verify();
            return input;
        }

        private void verify() {
        }
    }
}
