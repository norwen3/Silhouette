package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.ISource;

import java.util.HashMap;
import java.util.Map;

public class Audio extends ContainerElement{
    private Map<String, String> attributes, srcset;
    private Boolean autoplay,controls,loop,muted,preload;
    private String src;


    public Audio(Builder builder){
        this.attributes = builder.attributes;
        this.srcset = builder.srcset;
        this.autoplay=builder.autoplay;
        this.controls = builder.controls;
        this.loop = builder.loop;
        this.muted = builder.muted;
        this.preload = builder.preload;
        this.src = builder.src;
    }


    public static class Builder implements IBuilder,ISource {

        private Map<String, String> attributes, srcset;
        private Boolean autoplay,controls,loop,muted,preload;
        private String src;

        public Builder(){
            this.attributes = new HashMap<>();
            this.srcset = new HashMap<>();
            this.autoplay = true;
            this.controls = true;
            this.loop = true;
            this.muted = false;
            this.preload = true;
        }

        public Builder setAttributesFromMap(Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setSrcset(Map<String, String> srcset) {
            this.srcset = srcset;
            return this;
        }

        public Builder setAutoplay(Boolean autoplay) {
            this.autoplay = autoplay;
            return this;
        }

        public Builder setControls(Boolean controls) {
            this.controls = controls;
            return this;
        }

        public Builder setLoop(Boolean loop) {
            this.loop = loop;
            return this;
        }

        public Builder setMuted(Boolean muted) {
            this.muted = muted;
            return this;
        }

        public Builder setPreload(Boolean preload) {
            this.preload = preload;
            return this;
        }

        public Builder setAudioSrc(String src) {
            this.src = src;
            return this;
        }

        @Override
        public Audio build() {
            Audio a = new Audio(this);
            verify();
            return a;
        }


        @Override
        public Builder addSource(String key, String value) {
            this.srcset.put(key,value);
            return this;
        }
    }

}
