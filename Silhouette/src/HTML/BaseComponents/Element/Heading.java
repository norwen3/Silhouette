package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Heading extends ContainerElement{
    private final int level;
    private String text;

    public Heading(Builder builder){
        this.level = builder.level;
        this.text = builder.text;
    }

    public int getLevel() {
        return level;
    }

    public String getText() {
        return text;
    }
    @Override
    public String toString(){
        return "<h"+level+">"+text+"</h"+level+">";
    }

    public static class Builder implements IBuilder {
        private final int level;
        private String text;


        public Builder(int level) {
            this.level = level;
            this.text = "";
        }

        public Builder setText(String text) {
            this.text = text;
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
