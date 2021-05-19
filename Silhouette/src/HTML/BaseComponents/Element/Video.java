package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.IDimensions;
import HTML.BaseComponents.ILowLevel.ISource;

//
//

/**
 * This class represents a Video-tag
 * Source tag auto generates
 */
public class Video extends ContainerElement {
    private String width, height, source,type;


    /**
     * Constructor used by Builder
     * @param builder
     */

    private Video(Builder builder){
        this.width = builder.width;
        this.height = builder.height;
        this.source = builder.source;
        this.type = builder.type;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    /**
     * Builder for Video-Element
     * Returns a Video-object
     */
    public static class Builder implements IBuilder, IDimensions, ISource{
        private String width, height, source,type;

        /**
         * Sets a standard Video tag
         * Width = 100
         * Height = 100
         * no source
         * type = video/mp4
         */
        public Builder(){
            this.width = "100";
            this.height = "100";
            this.source = "";
            this.type = "video/mp4";
        }

        /**
         * Sets the width of the video
         * @param dimension
         * @return
         */
        @Override
        public Builder setWidth(String dimension) {
            this.width = dimension;
            return this;
        }

        /**
         * Sets the height of the video
         * @param dimension
         * @return
         */
        @Override
        public Builder setHeight(String dimension) {
            this.height = dimension;
            return this;
        }

        /**
         *
         * @param source
         * @param type
         * @return
         */
        @Override
        public Builder addSource(String source, String type){
            this.source = source;
            this.type = type;
            return this;
        }


        @Override
        public Video build() {
            Video v = new Video(this);
            verify();
            return v;
        }

    }
}

/*

<video width="320" height="240" controls>
  <source src="movie.mp4" type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>

 */