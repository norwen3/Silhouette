package HTML.BaseComponents.Element;

import HTML.BaseComponents.ILowLevel.IBuilder;
import HTML.BaseComponents.ILowLevel.ISource;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines an Audio-tag Element
 */
public class Audio extends ContainerElement{
    private Map<String, String> attributes, srcset;
    private Boolean autoplay,controls,loop,muted,preload;
    private String src;


    private Audio(Builder builder){
        this.attributes = builder.attributes;
        this.srcset = builder.srcset;
        this.autoplay=builder.autoplay;
        this.controls = builder.controls;
        this.loop = builder.loop;
        this.muted = builder.muted;
        this.preload = builder.preload;
        this.src = builder.src;
    }

    @Override
    public Map<String, String> getAttributes() {
        return attributes;
    }

    public Map<String, String> getSrcset() {
        return srcset;
    }

    public Boolean getAutoplay() {
        return autoplay;
    }

    public Boolean getControls() {
        return controls;
    }

    public Boolean getLoop() {
        return loop;
    }

    public Boolean getMuted() {
        return muted;
    }

    public Boolean getPreload() {
        return preload;
    }

    public String getSrc() {
        return src;
    }

    /**
     * Builder class for Audio-tag
     * This class is used to create Audio-objects
     */
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

        /**
         * sets global attributes from predefined map
         * @param attributes
         * @return
         */
        public Builder setAttributesFromMap(Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Sets the source set for the Audio-tag
         * @param srcset
         * @return
         */
        public Builder setSrcset(Map<String, String> srcset) {
            this.srcset = srcset;
            return this;
        }

        /**
         * Determines whether Audio will autoplay
         * @param autoplay
         * @return
         */
        public Builder setAutoplay(Boolean autoplay) {
            this.autoplay = autoplay;
            return this;
        }

        /**
         * Determines whether User Controls will be available for Audio-tag
         * @param controls
         * @return
         */
        public Builder setControls(Boolean controls) {
            this.controls = controls;
            return this;
        }

        /**
         * Determines whether Audio will loop when finished
         * @param loop
         * @return
         */
        public Builder setLoop(Boolean loop) {
            this.loop = loop;
            return this;
        }

        /**
         * Determines whether Audio will be muted on loading
         * @param muted
         * @return
         */
        public Builder setMuted(Boolean muted) {
            this.muted = muted;
            return this;
        }

        /**
         * Determines whether Audio will be preloaded on loading
         * @param preload
         * @return
         */
        public Builder setPreload(Boolean preload) {
            this.preload = preload;
            return this;
        }

        /**
         * Sets the Audio-source
         * @param src
         * @return
         */
        public Builder setAudioSrc(String src) {
            this.src = src;
            return this;
        }

        /**
         * Returns an Audio-object
         * @return
         */
        @Override
        public Audio build() {
            Audio a = new Audio(this);
            return a;
        }


        /**
         * Adds an audio source to the source-set
         * @param key
         * @param value
         * @return
         */
        @Override
        public Builder addSource(String key, String value) {
            this.srcset.put(key,value);
            return this;
        }
    }

}
