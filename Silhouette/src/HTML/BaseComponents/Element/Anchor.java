package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.HashMap;
import java.util.Map;

// Represents an anchor element (url link)
// Can instantiate anchor OR use static method
public class Anchor extends ContainerElement {

    private String text;
    private String url;
    Map<String, String> attributes;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    private Anchor(Builder builder){
        this.text = builder.text;
        this.url = builder.url;
    }

    @Override
    public String toString(){
        return "<a href=\"" + this.url + "\">" +this.text + "<\\a>";
    }

    public static class Builder implements IBuilder {
        private String text;
        private String url;
        Map<String, String> attributes;

        public Builder(){
            this.text = "";
            this.url = "";
            this.attributes = new HashMap<>();
        }

        public Builder setLink(String text, String url){
            // returns <a href="url">text</a>
            this.text = text;
            this.url = url;
            return this;
        }

        public Builder setText(String text){
            this.text = text;
            return this;
        }
        public Builder setUrl(String url){
            this.url = url;
            return this;
        }


        @Override
        public Anchor build(){
            Anchor a = new Anchor(this);
            verify();
            return a;
        }


    }
}
