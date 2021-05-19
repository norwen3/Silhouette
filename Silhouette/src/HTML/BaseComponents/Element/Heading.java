package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

/**
 * This class represents the Heading-element
 * <h1></h1> etc.
 */
public class Heading extends ContainerElement{
    private String level;
    private String text;

    /**
     * Constructor used by builder class
     * @param builder
     */
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

    /**
     * Builder class for Heading-elements
     * Returns h-tag objects
     */
    public static class Builder implements IBuilder {
        //standard level is h1
        private String level;
        private String text;

        /**
         * Constructor sets an empty H1 tag
         */
        public Builder() {
            this.level = "h1";
            this.text = "";
        }

        /**
         * Set the textual value of the Heading
         * @param text
         * @return
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        /**
         * Set the level of the heading as string
         * e.g. "h2" returns <h2></h2> tag
         * @param level
         * @return
         */
        public Builder setLevel(String level){
            this.level = level;
            return this;
        }

        /**
         * Creates the heading-element
         * @return
         */
        @Override
        public Heading build() {
            Heading h = new Heading(this);
            verify();
            return h;
        }

    }
}
