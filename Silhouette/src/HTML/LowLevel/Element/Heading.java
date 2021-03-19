package HTML.LowLevel.Element;

public class Heading extends ContainerElement{
    private final int level;
    private final String text;

    public Heading(HeadingBuilder builder){
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

    public static class HeadingBuilder {
        private final int level;
        private final String text;

        public HeadingBuilder(int level, String text){
            this.level = level;
            this.text = text;
        }
    }
}
