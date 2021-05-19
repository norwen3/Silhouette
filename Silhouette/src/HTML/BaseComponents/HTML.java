package HTML.BaseComponents;

import HTML.BaseComponents.Element.Element;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HTML {
    private String title, metaName, metaContent, metaProperty,
            metaPropertyContent, http_equiv, metaHttpContent, charset, metaHtml;
    private Map<String,String> links;
    private List<Element> pageBody;

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
    public void initialize(String fileName) throws IOException {
        // Initializes the html generation
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName+".html"));
        writer.write(this.toString());
        writer.close();
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html><html>\n" +
                "<head>\n" + this.title + this.metaName + this.metaContent + this.metaProperty+
                this.metaPropertyContent + this.http_equiv + this.metaHttpContent + this.charset + this.metaHtml
                +"</head>\n"
                +elementIterator() + "\n</html>";
    }

    //Container c = new Container.Builder().build();
    public static class Builder{
        private String title, metaName, metaContent, metaProperty,
                metaPropertyContent, http_equiv, metaHttpContent, charset, metaHtml;
        private Map<String,String> links;
        private List<Element> pageBody;

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
        public Builder setTitle(String title) {
            this.title = "<title>"+title+"</title>\n";
            return this;
        }
        public Builder append(Element... elements){
            for(Element e: elements){
                this.pageBody.add(e);
            }
            return this;
        }

        // Modify meta data
        public Builder setMetaName(String metaName, String metaContent){
            // <meta name="application-name" content="Rey Bango Front-end Developer"/>
            this.metaName = "<meta name=\""+metaName+"\" ";
            this.metaContent = "content=\""+metaContent+"\"/>\n";
            return this;
        }
        public Builder setMetaProperty(String metaProperty, String metaPropertyContent){
            // <meta property="og:audio" content="http://example.com/amazing.mp3" />
            this.metaProperty = "<meta property=\""+ metaProperty+"\"";
            this.metaPropertyContent = " content=\""+metaPropertyContent+"\" />\n";
            return this;
        }
        public Builder setMetaHttpEquiv(String http_equiv, String metaHttpContent){
            // <meta http-equiv="X-UA-Compatible" content="chrome=1">
            this.http_equiv = "<meta http-equiv=\""+http_equiv+" ";
            this.metaHttpContent = "content=\""+metaHttpContent+"\"/>\n";
            return this;
        }
        public Builder setMetaCharset(String charset){
            this.charset ="<meta charset=\""+ charset+"\" />\n";
            return this;
        }
        public Builder setMetaDataAsHTML(String metaDataAsHTML){
            // Allows user to add html explicitly
            this.metaHtml = metaDataAsHTML;
            return this;
        }

        // Modify link data (w/ Overloads)
        private Builder setLink(String rel, String href){
            // <link rel="apple-touch-icon" href="iphone.png" />
            this.links.put("<link rel=\""+rel+"\"","href=\""+href+"\" />\n" );
            return this;
        }
        //title can be empty ""
        public Builder setLink(String rel, String href, String title){
            // <link rel="apple-touch-icon" href="iphone.png" title="my-touch-icon" />
            String s=" title=\""+title+"\"";
            setLink(rel,href+s);
            return this;
        }

        public Builder setLinkSize(String rel, String href, String sizes){
            // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" />
            setLink(rel,href + "sizes=\""+sizes+"\"");
            return this;
        }
        public Builder setLinkSize(String rel, String href, String sizes, String title){
            // <link rel="apple-touch-icon" href="ipad.png" sizes="72x72" title="my-touch-icon" />
            setLink(rel,href+"sizes=\""+sizes+"\"",title);
            return this;
        }

        public Builder setLinkType(String rel, String href, String type){
            // <link rel="apple-touch-icon" href="ipad.png" type="image/png" />
            String s= "type=\""+type+"\"";
            setLink(rel,href+s);
            return this;
        }
        public Builder setLinkType(String rel, String href, String type, String title){
            // <link rel="apple-touch-icon" href="ipad.png" type="image/png" title="my-touch-icon" />
            String s="title=\""+title+"\"";
            setLinkType(rel,href,type+s);
            return this;
        }

        public Builder setLinkMedia(String rel, String href, String type, String media){
            // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" />
            String s = "media=\"("+ media + ")\"";
            setLinkType(rel, href,type+s);
            return this;
        }
        public Builder setLinkMedia(String rel, String href, String type, String media, String title){
            // <link rel="stylesheet" href="stylesheet.css" type="text/css" media="(max-width: 480px)" title="my-css" />
            String s = "media=\"("+ media + ")\" title=\""+title+"\"";;
            setLinkType(rel,href,type+s);
            return this;
        }

        public HTML build(){
            HTML page = new HTML(this);
            return page;
        }

    }
}


