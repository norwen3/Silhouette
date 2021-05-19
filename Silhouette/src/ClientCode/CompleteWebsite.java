package ClientCode;

import HTML.BaseComponents.Element.Anchor;
import HTML.BaseComponents.Element.Container;
import HTML.BaseComponents.Element.Heading;
import HTML.BaseComponents.Element.Paragraph;
import HTML.BaseComponents.HTML;
import HTML.Component.Page;
import StyleSheets.BaseComponents.StyleSheet;
import StyleSheets.Grid;
import StyleSheets.Values.Property;

public class CompleteWebsite {
    public static void main(String[] args) {

        // Styling

        Grid myGrid = new Grid.Builder("#mainGrid")
                .addRule(Property.GRID_TEMPLATE_COLUMNS, "2fr 1fr")
                .addRule(Property.GRID_TEMPLATE_ROWS, "200px auto auto")
                .setTemplateAreas("header header", "main aside", "footer footer")
                .build();

        StyleSheet myStyleSheet = new StyleSheet.Builder("main.css", "")
                .build();

        // Markup

        Anchor myAnchor = new Anchor.Builder()
                .setLink("Go back to the top", "#mainHeading")
                .build();

        Container myFooter = new Container.Builder()
                .addElements(myAnchor)
                .build();

        Paragraph myParagraph = new Paragraph.Builder()
                .setText("Sample Text")
                .build();

        Container myMain = new Container.Builder()
                .addElements(myParagraph)
                .build();

        Heading myHeading = (Heading) new Heading.Builder()
                .setText("My Awesome Website")
                .addAttributes("id", "mainHeading")
                .build();

        Container myHeader = new Container.Builder()
                .addElements(myHeading)
                .build();

        Container myBody = (Container) new Container.Builder()
                .setType("body")
                .addAttributes("id", "#mainGrid")
                .build();

        HTML frontPage = new HTML.Builder()
                .setMetaCharset("UTF-8")
                .setLinkType("stylesheet", "main.css", "text/css")
                .append()
                .build();


    }
}
