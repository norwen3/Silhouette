package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

/**
 * This class represents the Paragraph-tag
 * <p></p>
 */
public class Paragraph extends ContainerElement {
    private String text;


    /**
     * Constructor used by builder
     * @param builder
     */
    private Paragraph(Builder builder){
        this.text = builder.text;
    }



    public String getText() {
        return text;
    }

    @Override
    public String toString(){
        return "<p>"+text+"</p>";
    }


    /**
     * Builder class for paragraph
     * Returns a paragraph-object
     */

    public static class Builder implements IBuilder{
        private String text;

        /**
         * Sets the text in the p-tag to be empty
         */
        public Builder(){
            this.text = "";
        }

        /**
         * Sets the text in the p-tag
         * @param text
         * @return
         */
        public Builder setText(String text){
            this.text = text;
            return this;
        }

        /**
         * Creates a Paragraph element
         * @return
         */
        @Override
        public Paragraph build() {
            Paragraph p = new Paragraph(this);
            verify();
            return p;
        }


    }
}




/*
Container myArticle = new Container("Article");
myArticle.addElement(new Paragraph(
    "Yo bro, check this good ass link yo ganon ",
    Anchor.setLink("Pizza Time", "Craigslist.com")
));


 */