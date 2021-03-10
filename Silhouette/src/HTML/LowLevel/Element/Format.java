package HTML.LowLevel.Element;

// Formats text with <strong>, <i> etc..
// e.g Format.strong("Text"); --> <strong>Text</strong>
public class Format {
    public static String strong(String text){
        // returns <strong>text</strong>
        return null;
    }
    public static String bold(String text){
        // returns <b>text</b>
        return null;
    }
    public static String italic(String text){
        // returns <i>text</i>
        return null;
    }
    public static String emphasize(String text){
        // returns <em>text</em>
        return null;
    }
    public static String marked(String text){
        // returns <mark>text</mark>
        return null;
    }
    public static String small(String text){
        // returns <small>text</small>
        return null;
    }
    public static String deleted(String text){
        // returns <del>text</del>
        return null;
    }
    public static String inserted(String text){
        // returns <ins>text</ins>
        return null;
    }
    public static String subscript(String text){
        // returns <sub>text</sub>
        return null;
    }
    public static String supscript(String text){
        // returns <sup>text</sup>
        return null;
    }
    public static String preformatted(String text){
        // returns <pre>text</pre>
        return null;
    }
    public static String code(String text){
        // returns <code>text</code>
        return null;
    }
}

/*
Eggsample Tree
Paragraph par = new Paragraph();
par.addText("Hello world, check ", TextFormat.strong("this"), "out!");

Container myArticle = new Container("Article");
myArticle.addParagraph(par);

-->
<p>Hello world, check <strong>this</strong> out!</p>

Example Two
Paragraph par = new Paragraph();
par.addText("Hello world, check ");
par.addText(TextFormat.strong("this"));
par.addText(" out!");

Container myArticle = new Container("Article");
myArticle.addParagraph(par);

-->
<p>Hello world, check <strong>this</strong> out!</p>

Eksempel One

Container myArticle = new Container("Article");
myArticle.addText("Hello world, check ");
myArticle.addText(TextFormat.strong("this"));
myArticle.addText(" out!");

-->
<p>Hello world, check <strong>this</strong> out!</p>


*/