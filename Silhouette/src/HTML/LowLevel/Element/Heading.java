package HTML.LowLevel.Element;

public class Heading extends ContainerElement{
    private final int level;
    private final String text;

    public Heading(Builder builder){
        this.level = builder.level;
        this.text = builder.text;
    }

    public int getLevel() {
        return level;
    }

    public String getText() {
        return text;
    }
    @Override
    public String toString(){
        return "<h"+level+">"+text+"</h"+level+">";
    }

    public static class Builder {
        private final int level;
        private final String text;

        public Builder(int level, String text){
            this.level = level;
            this.text = text;
        }
        public Heading build(){
            Heading h = new Heading(this);
            verify();
            return h;
        }

        public void verify(){}
    }
}
