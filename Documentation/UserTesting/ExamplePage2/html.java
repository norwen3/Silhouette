import java.awt.Container;

public class html {
    public static void main(String[] args) {

        HTML myPage = new HTML();

        Container head = new Container("head");
        head.setLinkType("stylesheet", "style.css", "text/css");    
        
        Container body = new Container("body");
        Container header = new Container("header");
        Container main = new Container("main");
        Container footer = new Container("footer");
        body.addElement(header);
        body.addElement(main);
        body.addElement(footer);

        Heading h1 = new Heading("h1", "Title");
        h1.applyClass("myH1");

        Container nav = new Container("nav");
        header.addElement(nav);

        Anchor link = new Anchor("Google", "www.google.com");
        nav.addElement(link);

        Container article = new Container("article");
        main.addElement(article);

        Paragraph p = new Paragraph("Lorem Ipsum");
        p.applyId("myParagraph");
        article.addElement(p);

        myPage.append(head);
        myPage.append(body);
        myPage.initialize();

    }
}