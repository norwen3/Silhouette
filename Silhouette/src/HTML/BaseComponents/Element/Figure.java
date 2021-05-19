package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;

public class Figure extends ContainerElement {

    private Image img;
    private String figCaption;
    // Constructors
    public Figure(Builder builder){
        this.img = builder.img;
        this.figCaption = builder.figCaption;
    }
    public Figure(Image image){}
    public Figure(Image image, String figCaption){}

    // Methods
    public void addImage(Image image){}
    public void addFigCaption(String figCaption){}

    public static class Builder implements IBuilder{

        private Image img;
        private String figCaption;

        public Builder(){
            this.figCaption = "";
            this.img = null;
        }

        public Builder setImg(Image img){
            this.img = img;
            return this;
        }
        public Builder setFigCaption(String figCaption){
            this.figCaption = figCaption;
            return this;
        }
        @Override
        public Element build() {
            Figure f = new Figure(this);
            return f;
        }
    }
}
