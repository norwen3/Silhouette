package HTML.LowLevel.Component;

import HTML.LowLevel.Element.Element;

public class HTML {

    public void setTitle(String title) {}
    public void append(Element element){}

    public void initialize(){
        // Initializes the html generation
    }

    // Modify meta data
    public void setMetaName(String name, String content){
        // <meta name="application-name" content="Rey Bango Front-end Developer"/>
    }
    public void setMetaProperty(String property, String content){
        // <meta property="og:audio" content="http://example.com/amazing.mp3" />
    }
    public void setMetaHttpEquiv(String http_equiv, String content){
        // <meta http-equiv="X-UA-Compatible" content="chrome=1">
    }
    public void setMetaCharset(String charset){}
    public void setMetaDataAsHTML(String html){
        // Allows user to add html explicitly
    }

    // Modify link data (w/ Overloads)
    public static void setLink(String rel, String href){
        // <link rel="apple-touch-icon" href="iphone.png" />
    }
    public static void setLink(String rel, String href, String title){
        // <link rel="apple-touch-icon" href="iphone.png" title="my-touch-icon" />
    }

    public static void setLinkSize(String rel, String href, String sizes){
        // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" />
    }
    public static void setLinkSize(String rel, String href, String sizes, String title){
        // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" title="my-touch-icon" />
    }

    public static void setLinkType(String rel, String href, String type){
        // <link rel="apple-touch-icon" href="ipad.png" type="image/png" />
    }
    public static void setLinkType(String rel, String href, String type, String title){
        // <link rel="apple-touch-icon" href="ipad.png" type="image/png" title="my-touch-icon" />
    }

    public static void setLinkMedia(String rel, String href, String type, String media){
        // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" />
    }
    public static void setLinkMedia(String rel, String href, String type, String media, String title){
        // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" title="my-css" />
    }

    public static class Builder {

    }
}


