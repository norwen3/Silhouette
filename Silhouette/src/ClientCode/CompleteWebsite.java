package ClientCode;

import HTML.BaseComponents.Element.Anchor;
import HTML.BaseComponents.Element.Container;
import HTML.BaseComponents.Element.Heading;
import HTML.BaseComponents.Element.Paragraph;
import HTML.BaseComponents.HTML;
import HTML.Component.Page;
import StyleSheets.BaseComponents.RuleSet;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Grid;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

public class CompleteWebsite {
    public static void main(String[] args) {

        Color pageColor = Color.BEIGE;

        // Styling

        Grid myGrid = new Grid.Builder("#mainGrid")
                .addRule(Property.GRID_TEMPLATE_COLUMNS, "2fr 1fr")
                .addRule(Property.GRID_TEMPLATE_ROWS, "200px auto auto")
                .setTemplateAreas("header header", "main aside", "footer footer")
                .build();

        RuleSet myHeaderStyle = new RuleSet.Builder("header")
                .addRule(Property.BACKGROUND_COLOR, pageColor)
                .build();

        RuleSet myFooterStyle = new RuleSet.Builder("footer")
                .addRule(Property.BACKGROUND_COLOR, pageColor)
                .build();

        StyleSheet myStyleSheet = new StyleSheet.Builder("main", "WebFiles")
                .applyStyle(myGrid)
                .applyStyle(myHeaderStyle)
                .build();

        myStyleSheet.initialize();

        // Markup

        Anchor myAnchor = new Anchor.Builder()
                .setLink("Go back to the top", "#mainHeading")
                .build();

        Container myFooter = new Container.Builder()
                .setType("footer")
                .addElements(myAnchor)
                .build();

        Paragraph myParagraph = new Paragraph.Builder()
                .setText("Sample Text")
                .build();

        Container myMain = new Container.Builder()
                .setType("main")
                .addElements(myParagraph)
                .build();

        Heading myHeading = (Heading) new Heading.Builder()
                .setText("My Awesome Website")
                .addAttributes("id", "mainHeading")
                .build();

        Container myHeader = new Container.Builder()
                .setType("header")
                .addElements(myHeading)
                .build();

        Container myBody = (Container) new Container.Builder()
                .setType("body")
                .addElements(myHeader,myMain, myFooter)
                .addAttributes("id", "#mainGrid")
                .build();

        HTML myFrontPage = new HTML.Builder()
                .setMetaCharset("UTF-8")
                .setLinkType("stylesheet", "main.css", "text/css")
                .addElements(myBody)
                .build();

        myFrontPage.initialize("index");

    }
}
