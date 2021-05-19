package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;


/**
 * This class represents a Figure-element
 */

public class Figure extends ContainerElement {

    private Image img;
    private String figCaption;


    /**
     * Constructor used by Builder
     * @param builder
     */
    private Figure(Builder builder){
        this.img = builder.img;
        this.figCaption = builder.figCaption;
    }

    /**
     * Builder-class for Figure-elements
     */
    public static class Builder implements IBuilder{

        private Image img;
        private String figCaption;

        public Builder(){
            this.figCaption = "";
            this.img = null;
        }

        /**
         * Sets the image for the Figure
         * @param img
         * @return
         */
        public Builder setImg(Image img){
            this.img = img;
            return this;
        }

        /**
         * Sets the caption
         * @param figCaption
         * @return
         */
        public Builder setFigCaption(String figCaption){
            this.figCaption = figCaption;
            return this;
        }

        /**
         * Returns the Figure-element
         * @return
         */

        @Override
        public Element build() {
            Figure f = new Figure(this);
            return f;
        }
    }
}
