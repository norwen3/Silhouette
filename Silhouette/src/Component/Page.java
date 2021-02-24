package Component;

import Element.Element;

public class Page {

    public void setTitle(String title) {}
    public void append(Element element){}

    // Initializes the html generation
    public void initialize(){}

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
    public void setLink(String rel, String href){
        // <link rel="apple-touch-icon" href="touch-icon-iphone.png" />
    }
    public void setLink(String rel, String href, String title){
        // <link rel="apple-touch-icon" href="touch-icon-iphone.png" />
    }

    public void setLinkSize(String rel, String href, String sizes){
        // <link rel="apple-touch-icon" href="touch-icon-ipad.png" sizes="72x72" />
    }
    public void setLinkSize(String rel, String href, String sizes, String title){
        // <link rel="apple-touch-icon" href="touch-icon-ipad.png" sizes="72x72" />
    }

    public void setLinkType(String rel, String href, String type){
        // <link rel="apple-touch-icon" href="touch-icon-ipad.png" sizes="72x72" />
    }
    public void setLinkType(String rel, String href, String type, String title){
        // <link rel="apple-touch-icon" href="touch-icon-ipad.png" sizes="72x72" />
    }

    public void setLinkMedia(String rel, String href, String type, String media){
        // <link media="only screen and (max-device-width: 480px)" href="http://wordpress.org/style/iphone.css" type="text/css" rel="stylesheet" />
    }
    public void setLinkMedia(String rel, String href, String type, String media, String title){
        // <link media="only screen and (max-device-width: 480px)" href="http://wordpress.org/style/iphone.css" type="text/css" rel="stylesheet" />
    }

}
