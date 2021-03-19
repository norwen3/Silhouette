package HTML.LowLevel.Element;

// Represents an anchor element (url link)
// Can instantiate anchor OR use static method
public class Anchor extends ContainerElement {

    private String text;
    private String url;

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    private Anchor(AnchorBuilder builder){
        this.text = builder.text;
        this.url = builder.url;
    }

    @Override
    public String toString(){
        return "<a href=\"" + this.url + "\">" +this.text + "<\\a>";
    }

    public static class AnchorBuilder{
        private String text;
        private String url;

        public AnchorBuilder(){

        }
        public AnchorBuilder setLink(String text, String url){
            // returns <a href="url">text</a>
            this.text = text;
            this.url = url;
            return this;
        }

        public AnchorBuilder setText(String text){
            this.text = text;
            return this;
        }
        public AnchorBuilder setUrl(String url){
            this.url = url;
            return this;
        }

        public Anchor build(){
            Anchor a = new Anchor(this);
            verify();
            return a;
        }

        private void verify() {
        }

    }
}
