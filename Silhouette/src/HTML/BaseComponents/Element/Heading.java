package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Heading extends ContainerElement{
    private String level;
    private String text;

    public Heading(Builder builder){
        this.level = builder.level;
        this.text = builder.text;
    }

    public String getLevel() {
        return level;
    }

    public String getText() {
        return text;
    }
    @Override
    public String toString(){
        return "<"+level+">"+text+"</"+level+">";
    }

    public static class Builder implements IBuilder {
        //standard level is h1
        private String level;
        private String text;

        public Builder() {
            this.level = "h1";
            this.text = "";
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }
        public Builder setLevel(String level){
            this.level = level;
            return this;
        }

        @Override
        public Heading build() {
            Heading h = new Heading(this);
            verify();
            return h;
        }

    }
}
