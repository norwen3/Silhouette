package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Paragraph extends ContainerElement {
    private String text;

    // Constructors
    private Paragraph(Builder builder){
        this.text = builder.text;
    }


    // Methods
    public void addText(String... text){}

    public static class Builder implements IBuilder{
        private String text;

        public Builder(){
            this.text = "";
        }

        public Builder setText(String text){
            this.text = text;
            return this;
        }

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