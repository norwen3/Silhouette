package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.IDimensions;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents an img-tag
 * <img/>
 */
public class Image extends EmptyElement  {
    private String width;
    private String height;
    private String src;
    private Map<String, String> attributes;
    private String alt, style;

    /**
     * Constructor used by Builder
     * @param builder
     */
    private Image(Builder builder){
        this.width = builder.width;
        this.height = builder.height;
        this.src = builder.src;
        this.attributes = builder.attributes;
        this.alt = builder.alt;
        this.style = builder.style;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getSrc() {
        return src;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public String getAlt() {
        return alt;
    }

    @Override
    public String toString(){
        return "<img src=\""+this.src + "\" alt=\"" + this.alt + "\" width=\""+this.width
                + "\" height=\""+this.height+ "\" >";
    }

    public static class Builder implements IBuilder, IDimensions {
        private String width,height,src,alt,style;

        private Map<String,String> attributes;


        /**
         * Creates a basic image with auto width style and 100 width/height
         * no source set
         */
        public Builder(){
            this.width = "100";
            this.height= "100";
            this.src = "";
            this.attributes = new HashMap<>();
            this.alt="";
            this.style = "\"width:auto;\"";
        }

        /**
         * Sets css-styling directly on tag
         * @param style
         * @return
         */
        public Builder setStyle(String style){
            this.style = style;
            return this;
        }

        /**
         * Sets alt text for image
         * @param alt
         * @return
         */
        public Builder setAltText(String alt){
            this.alt=alt;
            return this;
        }

        /**
         * Sets the width of the image
         * @param width
         * @return
         */
        @Override
        public Builder setWidth(String width) {
            this.width = width;
            return this;
        }


        /**
         * Sets the height of the image
         * @param height
         * @return
         */
        @Override
        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        /**
         * Creates the Image-object
         * @return
         */
        @Override
        public Image build() {
            Image img = new Image(this);
            verify();
            return img;
        }

    }
}
