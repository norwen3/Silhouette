package HTML.Component;

import HTML.BaseComponents.Element.*;
import HTML.BaseComponents.HTML;
import HTML.BaseComponents.ILowLevel.IBuilder;

import java.io.IOException;

// Should be very simple, only declare stuff like Title and page index
//This might take over for director
public class Page {

    private static HTML.Builder builder;
    private HTML html;

    public Page(HTML.Builder builder){
        this.builder = builder;
    }

    public void basicPage() throws IOException {
        basicBuild().initialize("index");
    }
    private HTML.Builder basicPageInner(){


        Anchor link1 = new Anchor.Builder()
                .setLink("Home", "index.html")
                .build();
        link1.addAttribute("class", "homelink");

        return builder.append(new Container.Builder()
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
    public HTML basicBuild(){
        HTML.Builder temp =  basicPageInner();
        return temp.build();
    }


    private HTML.Builder innerArticlePage(){
        Container.Builder body= new Container.Builder().setType("body");
        Container.Builder main = new Container.Builder().setType("main");
        Container.Builder header = new Container.Builder().setType("header");
        Container.Builder footer = new Container.Builder().setType("footer");
        Container.Builder nav = new Container.Builder().setType("nav");
        Container.Builder aside = new Container.Builder().setType("aside");
        Container.Builder article = new Container.Builder().setType("article");


        return builder.setTitle("Article")
                .append(body.addElements(
                header.addElements(nav.build())
                        .build(),
                        main.addElements(aside.build(),article.build())
                                .build(),footer.build())
                        .build());

    }
}