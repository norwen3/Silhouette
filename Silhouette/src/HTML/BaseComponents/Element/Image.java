package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.IDimensions;

import java.util.HashMap;
import java.util.Map;

public class Image extends EmptyElement  {
    private String width;
    private String height;
    private String src;
    private Map<String, String> attributes;
    private String alt;
    // Constructor
    private Image(Builder builder){
        this.width = builder.width;
        this.height = builder.height;
        this.src = builder.src;
        this.attributes = builder.attributes;
    }




    public static class Builder implements IBuilder, IDimensions {
        private String width,height,src,alt,style;

        private Map<String,String> attributes;


        public Builder(){
            this.width = "100";
            this.height= "100";
            this.src = "";
            this.attributes = new HashMap<>();
            this.alt="";
            this.style = "\"width:auto;\"";
        }

        public Builder setStyle(String style){
            this.style = style;
            return this;
        }

        public Builder setAltText(String alt){
            this.alt=alt;
            return this;
        }

        @Override
        public Builder setWidth(String width) {
            this.width = width;
            return this;
        }


        @Override
        public Builder setHeight(String height) {
            this.height = height;
            return this;
        }

        @Override
        public Image build() {
            Image img = new Image(this);
            verify();
            return img;
        }

    }
}
