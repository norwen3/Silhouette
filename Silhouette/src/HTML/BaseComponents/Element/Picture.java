package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.IDimensions;
import HTML.BaseComponents.ILowLevel.ISource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class represents the Picture-tag
 * Picture class not fully implemented
 * Missing toString() implementation - CANNOT PRODUCE OUTPUT YET
 * <picture></picture>
 */
public class Picture extends ContainerElement{
    private List<Image> images;
    private Map<String,String> source;

    /**
     * Constructor used by Builder
     * @param builder
     */
    private Picture(Builder builder){
        this.images = builder.images;
        this.source = builder.source;
    }

    public List<Image> getImages() {
        return images;
    }

    public Map<String, String> getSource() {
        return source;
    }

    /**
     * Builder class for Picture-element
     * returns a Picture-object
     */
    public static class Builder implements IBuilder, ISource {
        private List<Image> images;
        private Map<String,String> source;

        /**
         * Constructor sets list and maps to be empty
         */
        public Builder(){
            this.images = new ArrayList<>();
            this.source = new HashMap<>();
        }

        /**
         * Takes one or more Images and adds them to the list
         * @param img
         * @return
         */
        public Builder addImage(Image... img){
            for(Image i:img){
                this.images.add(i);
            }
            return this;
        }


        /**
         * Returns a Picture object
         * @return
         */
        @Override
        public Picture build() {
            Picture p = new Picture(this);
            verify();
            return p;
        }


        /**
         * Adds a source to the Map
         * @param media
         * @param srcset
         * @return
         */
        @Override
        public Builder addSource(String media, String srcset) {
            this.source.put(media, srcset);
            return this;
        }
    }
}
