public class css {
    public static void main(String[] args) {
        Stylesheet myStylesheet = new Stylesheet("style.css");
        RuleSet bodyStyle = new RuleSet();
        bodyStyle
            .setSelector("body")
            .addRule("background-color", Color.RGB(200, 245, 240))
            .setDisplay("grid");
        
        RuleSet navStyle = new RuleSet();
        navStyle
            .setSelector("nav")
            .setDisplay("flex");

        RuleSet h1Style = new RuleSet();
        h1Style
            .setClass("myH1")
            .addRule("font-size", "3em");
        
        RuleSet pStyle = new RuleSet();
        pStyle
            .setId("myParagraph")
            .addRule("background-color", Color.Hex("#179421"));
    }
}
