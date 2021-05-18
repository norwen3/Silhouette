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
        build().initialize("index");
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
                                .addElement(new Container.Builder()
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
                                .addElement(
                                        new Anchor.Builder()
                                                .setLink("Go to google", "www.google.com")
                                                .build()
                                ).build())
                .build())
                .setMetaCharset("utf-8")
                .setTitle("Main Page")
                ;
    }
    public HTML build(){
        HTML.Builder temp =  basicPageInner();
        return temp.build();
    }

}