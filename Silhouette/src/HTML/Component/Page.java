package HTML.Component;

import HTML.BaseComponents.Element.*;
import HTML.BaseComponents.HTML;
import HTML.BaseComponents.ILowLevel.IBuilder;

/**
 * Should be very simple, only declare stuff like Title and page index
 * This class works currently as a director
 */
public class Page {

    private static HTML.Builder builder;
    private HTML html;

    public Page(HTML.Builder builder){
        this.builder = builder;
    }

    /**
     * Builds a pre-made article-page HTML object that is mutable
     * Make your changes and use .initialize() method to write to file
     * @return
     */
    public HTML articlePageBuild(){
        return innerArticlePage().build();
    }

    /**
     * Creates a pre-made article-page and writes it to file
     * File-name is "article.html" and will appear in your src-folder
     */
    public void articlePage(){
        articlePageBuild().initialize("article");
    }

    /**
     * Creates a pre-made basic-page and writes it to file
     * File-name is "index.html" and will appear in your src-folder
     */
    public void basicPage() {
        basicBuild().initialize("index");
    }

    /**
     * inner private method that returns an HTML-builder
     * @return
     */
    private HTML.Builder basicPageInner(){


        Anchor link1 = new Anchor.Builder()
                .setLink("Home", "index.html")
                .build();
        link1.addAttribute("class", "homelink");

        return builder.addElements(new Container.Builder()
                .setType("body")
                .addElements(new Container.Builder()
                                .setType("header")
                                .addElements(new Container.Builder()
                                            .setType("nav")
                                            .addElements(new Heading.Builder()
                                                .setText("Main Page")
                                                .build(), link1)
                                            .build())
                                .build(),
                        new Container.Builder()
                                .setType("main")
                                .addElements(new Heading.Builder()
                                        .setLevel("h2")
                                        .setText("Article Title")
                                        .build(),
                                        new Paragraph.Builder()
                                                .setText("Lorem ipsum rando lal ksks jejas j")
                                                .build(),
                                        new Image.Builder()
                                                .setAltText("a cat")
                                                .build())
                                .build(),new Container.Builder()
                                .setType("footer")
                                .addElements(
                                        new Anchor.Builder()
                                                .setLink("Go to google", "www.google.com")
                                                .build()
                                ).build())
                .build())
                .setMetaCharset("utf-8")
                .setTitle("Main Page")
                ;
    }

    /**
     * Builds a mutable HTML object
     * Make your changes and use .initialize() method to write to file
     * @return
     */
    public HTML basicBuild(){
        return basicPageInner().build();
    }

    /**
     * Inner private method that returns HTML-builder for an article page
     * @return
     */
    private HTML.Builder innerArticlePage(){
        Container.Builder body= new Container.Builder().setType("body");
        Container.Builder main = new Container.Builder().setType("main");
        Container.Builder header = new Container.Builder().setType("header");
        Container.Builder footer = new Container.Builder().setType("footer");
        Container.Builder nav = new Container.Builder().setType("nav");
        Container.Builder aside = new Container.Builder().setType("aside");
        Container.Builder article = new Container.Builder().setType("article");


        return builder.setTitle("Article")
                .addElements(body.addElements(
                header.addElements(nav.build())
                        .build(),
                        main.addElements(aside.build(),article.build())
                                .build(),footer.build())
                        .build()).setLinkType("stylesheet","styles.css","text/css");

    }
}