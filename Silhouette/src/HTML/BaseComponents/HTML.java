package HTML.BaseComponents;

import HTML.BaseComponents.Element.Element;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * This class represents an HTML-file
 * Contains the initialize() method that writes to file
 */
public class HTML {
    private String title, metaName, metaContent, metaProperty,
            metaPropertyContent, http_equiv, metaHttpContent, charset, metaHtml;
    private Map<String,String> links;
    private List<Element> pageBody;

    /**
     * Constructor used by Builder class
     * @param builder
     */
    public HTML(Builder builder){
        this.title = builder.title;
        this.metaName = builder.metaName;
        this.metaContent = builder.metaContent;
        this.metaProperty = builder.metaProperty;
        this.metaPropertyContent = builder.metaPropertyContent;
        this.http_equiv = builder.http_equiv;
        this.metaHttpContent = builder.metaHttpContent;
        this.charset = builder.charset;
        this.metaHtml = builder.metaHtml;
        this.links = builder.links;
        this.pageBody = builder.pageBody;
    }

    public String getTitle() {
        return title;
    }

    public String getMetaName() {
        return metaName;
    }

    public String getMetaContent() {
        return metaContent;
    }

    public String getMetaProperty() {
        return metaProperty;
    }

    public String getMetaPropertyContent() {
        return metaPropertyContent;
    }

    public String getHttp_equiv() {
        return http_equiv;
    }

    public String getMetaHttpContent() {
        return metaHttpContent;
    }

    public String getCharset() {
        return charset;
    }

    public String getMetaHtml() {
        return metaHtml;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public List<Element> getPageBody() {
        return pageBody;
    }

    /**
     * iterates over the elements in the pagebody and toStrings each element to
     * a variable and returns this to the local toString() method
     * @return
     */
    private String elementIterator(){
        String body = "";
        if(this.pageBody != null){
            for(Element e: this.pageBody){
                body += e.toString()+"\n";
            }
            return body;
        }else{
                return "";
            }

    }

    /**
     * Iterates through the link list and returns them as a String
     * @return
     */
    private String linkIterator(){
        Iterator<Map.Entry<String, String>> temp = links.entrySet().iterator();
        String linkContent = "";
        while(temp.hasNext()){
            Map.Entry<String, String> pair = temp.next();
            linkContent += pair.getKey() + " " + pair.getValue() + "\n";
        }
        return linkContent;
    }

    /**
     * Writes the HTML object to file
     * @param fileName
     */
    public void initialize(String fileName) {
        // Initializes the html generation

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+".html"));
            writer.write(this.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "<!DOCTYPE html><html>\n" +
                "<head>\n" + this.title + this.metaName + this.metaContent + this.metaProperty+
                this.metaPropertyContent + this.http_equiv + this.metaHttpContent + this.charset + this.metaHtml
                +linkIterator()+"</head>\n"
                +elementIterator() + "\n</html>";
    }

    //Container c = new Container.Builder().build();
    public static class Builder{
        private String title, metaName, metaContent, metaProperty,
                metaPropertyContent, http_equiv, metaHttpContent, charset, metaHtml;
        private Map<String,String> links;
        private List<Element> pageBody;

        /**
         * Constructor sets standards to empty,
         * charset set to UTF-8
         */
        public Builder(){
            this.links = new HashMap<>();
            this.pageBody = new ArrayList<>();
            this.title = "";
            this.metaName = "";
            this.metaContent = "";
            this.metaProperty= "";
            this.metaPropertyContent = "";
            this.http_equiv = "";
            this.metaHttpContent = "";
            this.charset = "<meta charset=\"UTF-8\" />";
            this.metaHtml = "";
        }

        /**
         * Sets the title of the HTML-page
         * @param title
         * @return
         */
        public Builder setTitle(String title) {
            this.title = "<title>"+title+"</title>\n";
            return this;
        }

        /**
         * Adds elements to the HTML-page
         * Usually only one should be necessary as you should use Containers
         * to add content to the site's body (remember to make a body-container)
         * @param elements
         * @return
         */
        public Builder addElements(Element... elements){
            for(Element e: elements){
                this.pageBody.add(e);
            }
            return this;
        }

        /**
         * Sets name of metadata
         * @param metaName
         * @param metaContent
         * @return
         */
        public Builder setMetaName(String metaName, String metaContent){
            // <meta name="application-name" content="Rey Bango Front-end Developer"/>
            this.metaName = "<meta name=\""+metaName+"\" ";
            this.metaContent = "content=\""+metaContent+"\"/>\n";
            return this;
        }

        /**
         * Sets metaPorperty and content
         * @param metaProperty
         * @param metaPropertyContent
         * @return
         */
        public Builder setMetaProperty(String metaProperty, String metaPropertyContent){
            // <meta property="og:audio" content="http://example.com/amazing.mp3" />
            this.metaProperty = "<meta property=\""+ metaProperty+"\"";
            this.metaPropertyContent = " content=\""+metaPropertyContent+"\" />\n";
            return this;
        }

        /**
         * Sets the httpequiv and content
         * @param http_equiv
         * @param metaHttpContent
         * @return
         */
        public Builder setMetaHttpEquiv(String http_equiv, String metaHttpContent){
            // <meta http-equiv="X-UA-Compatible" content="chrome=1">
            this.http_equiv = "<meta http-equiv=\""+http_equiv+" ";
            this.metaHttpContent = "content=\""+metaHttpContent+"\"/>\n";
            return this;
        }

        /**
         * Sets the charset for the HTML-page
         * @param charset
         * @return
         */
        public Builder setMetaCharset(String charset){
            this.charset ="<meta charset=\""+ charset+"\" />\n";
            return this;
        }

        /**
         * Write explicit HTML here, make sure you know what you are doing if you
         * use this feature
         * @param metaDataAsHTML
         * @return
         */
        public Builder setMetaDataAsHTML(String metaDataAsHTML){
            // Allows user to add html explicitly
            this.metaHtml = metaDataAsHTML;
            return this;
        }

        /**
         * Modify link data (w/ Overloads)
         * @param rel
         * @param href
         * @return
         */
        public Builder setLink(String rel, String href){
            // <link rel="apple-touch-icon" href="iphone.png" />
            this.links.put("<link rel=\""+rel+"\"","href=\""+href+"\" />\n" );
            return this;
        }

        /**
         * title can be empty ""
         * @param rel
         * @param href
         * @param title
         * @return
         */
        public Builder setLink(String rel, String href, String title){
            // <link rel="apple-touch-icon" href="iphone.png" title="my-touch-icon" />
            String s=" title=\""+title+"\"";
            setLink(rel,href+s);
            return this;
        }

        /**
         * Link relation with sizes
         * @param rel
         * @param href
         * @param sizes
         * @return
         */
        public Builder setLinkSize(String rel, String href, String sizes){
            // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" />
            setLink(rel,href + "sizes=\""+sizes+"\"");
            return this;
        }

        /**
         * Overload with title
         * @param rel
         * @param href
         * @param sizes
         * @param title
         * @return
         */
        public Builder setLinkSize(String rel, String href, String sizes, String title){
            // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" title="my-touch-icon" />
            setLink(rel,href+"sizes=\""+sizes+"\"",title);
            return this;
        }

        /**
         * Linking with type
         * @param rel
         * @param href
         * @param type
         * @return
         */
        public Builder setLinkType(String rel, String href, String type){
            // <link rel="apple-touch-icon" href="ipad.png" type="image/png" />
            String s= "type=\""+type+"\"";
            setLink(rel,href+s);
            return this;
        }

        /**
         * Overload with title
         * @param rel
         * @param href
         * @param type
         * @param title
         * @return
         */
        public Builder setLinkType(String rel, String href, String type, String title){
            // <link rel="apple-touch-icon" href="ipad.png" type="image/png" title="my-touch-icon" />
            String s="title=\""+title+"\"";
            setLinkType(rel,href,type+s);
            return this;
        }

        /**
         * Linking with media
         * @param rel
         * @param href
         * @param type
         * @param media
         * @return
         */
        public Builder setLinkMedia(String rel, String href, String type, String media){
            // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" />
            String s = "media=\"("+ media + ")\"";
            setLinkType(rel, href,type+s);
            return this;
        }

        /**
         * Overload with title
         * @param rel
         * @param href
         * @param type
         * @param media
         * @param title
         * @return
         */
        public Builder setLinkMedia(String rel, String href, String type, String media, String title){
            // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" title="my-css" />
            String s = "media=\"("+ media + ")\" title=\""+title+"\"";;
            setLinkType(rel,href,type+s);
            return this;
        }

        /**
         * Builds the HTML-object
         * @return
         */
        public HTML build(){
            HTML page = new HTML(this);
            return page;
        }

    }
}


