package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

import java.util.HashMap;
import java.util.Map;



/**
 * Defines an Anchor-tag Element <a></a>
 */
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



    /**
     * Constructor used for Builder
     * @param builder
     */

    private Anchor(Builder builder){
        this.text = builder.text;
        this.url = builder.url;
        this.attributes = builder.attributes;
    }

    @Override
    public String toString(){
        return "<a href=\"" + this.url + "\">" +this.text + "</a>";
    }

    /**
     * Builder class for Anchor-tag <a></a>
     * This is an inner class that creates an Anchor-element
     */
    public static class Builder implements IBuilder {
        private String text;
        private String url;
        Map<String, String> attributes;

        public Builder(){
            this.text = "";
            this.url = "";
            this.attributes = new HashMap<>();
        }

        /**
         * Sets the href content of the tag
         * and <a>the text between the tags</a>
         * @param text
         * @param url
         * @return
         */
        public Builder setLink(String text, String url){
            // returns <a href="url">text</a>
            this.text = text;
            this.url = url;
            return this;
        }

        /**
         *  <a>sets the text between the tags</a>
         * @param text
         * @return
         */
        public Builder setText(String text){
            this.text = text;
            return this;
        }

        /**
         * Sets the href value
         * @param url
         * @return
         */
        public Builder setUrl(String url){
            this.url = url;
            return this;
        }


        /**
         * Returns the Anchor object
         * @return
         */
        @Override
        public Anchor build(){
            Anchor a = new Anchor(this);
            return a;
        }


    }
}
