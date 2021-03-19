package HTML.LowLevel.Element;

import java.util.List;

public class Paragraph extends ContainerElement {
    private List<Element> elementList;

    public Paragraph(ParagraphBuilder builder){}

    // Constructors
    public Paragraph(){}
    public Paragraph(String... text){
        return;
        //return new Paragraph(text).toString();
    }

    // Methods
    public void addText(String... text){
        return;
        //return new addText(text);
    }

    @Override
    public String toString() {
        return "<p> " + elementList.toString() + "</p>";
    }

    public static class ParagraphBuilder{

        public ParagraphBuilder(){}


    }
}


/*
Container myArticle = new Container("Article");
myArticle.addElement(new Paragraph(
    "Yo bro, check this good ass link yo ganon ",
    Anchor.setLink("Pizza Time", "Craigslist.com")
));


 */