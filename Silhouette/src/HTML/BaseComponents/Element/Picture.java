package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.IDimensions;
import HTML.BaseComponents.ILowLevel.ISource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Picture extends ContainerElement{
    private List<Image> images;
    private Map<String,String> source;
    // Constructor
    private Picture(Builder builder){
        this.images = builder.images;
        this.source = builder.source;
    }



    public static class Builder implements IBuilder, ISource {
        private List<Image> images;
        private Map<String,String> source;

        public Builder(){
            this.images = new ArrayList<>();
            this.source = new HashMap<>();
        }

        public Builder addImage(Image... img){
            for(Image i:img){
                this.images.add(i);
            }
            return this;
        }


        @Override
        public Picture build() {
            Picture p = new Picture(this);
            verify();
            return p;
        }



        @Override
        public Builder addSource(String media, String srcset) {
            this.source.put(media, srcset);
            return this;
        }
    }
}
