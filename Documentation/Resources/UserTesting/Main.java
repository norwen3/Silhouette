package Thomas;

import CSS.LowLevel.Style.RuleSet;
import CSS.LowLevel.StyleSheet;
import HTML.LowLevel.Component.HTML;
import HTML.LowLevel.Element.Anchor;
import HTML.LowLevel.Element.Container;
import HTML.LowLevel.Element.Heading;
import HTML.LowLevel.Element.Paragraph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HTML html = new HTML();
        html.setLinkType("stylesheet","style.css" ,"css" );

        Container head = new Container("head");
        Container body = new Container("body");

        html.append(head);

        Container header = new Container("header");
        Container main = new Container("main");
        Container footer = new Container("footer");

        Heading heading = new Heading("1", "asdasdsada");
        heading.applyClass("h1 class name");

        header.addElement(heading);

        body.addElement(header);
        body.addElement(main);
        body.addElement(footer);

        Container nav = new Container("nav");
        header.addElement(nav);

        Anchor anchor = new Anchor("google","google.com");
        nav.addElement(anchor);

        Container article = new Container("article");
        Paragraph p = new Paragraph("YESYEYES");

        article.addElement(p);
        p.applyId("paragraph");

        main.addElement(article);

        html.append(body);
        html.initialize();

        StyleSheet css = new StyleSheet();
        RuleSet rs = new RuleSet();

        rs.setSelector("body");
        rs.addRule("background-color", "red");
        rs.setDisplay("grid");

        RuleSet rsNav = new RuleSet();
        rsNav.setSelector("nav");
        rsNav.setDisplay("flex");

        RuleSet rsfont = new RuleSet();
        rsfont.setClass("header");
        rsfont.addRule("font-size", "12px");

        RuleSet pC = new RuleSet();
        pC.setId("paragraph");
        pC.addRule("background-color", "blue");

    }
}
