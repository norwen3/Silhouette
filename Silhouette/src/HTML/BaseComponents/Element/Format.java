package HTML.BaseComponents.Element;

// Formats text with <strong>, <i> etc..
// e.g Format.strong("Text"); --> <strong>Text</strong>
public class Format {

    /**
     * Sets text to Strong
     * @param text
     * @return
     */
    public static String strong(String text){
        return "<strong>"+text+"</strong>";
    }

    /**
     * Sets text to bold
     * @param text
     * @return
     */
    public static String bold(String text){
        return "<b>"+text+"</b>";
    }

    /**
     * Text to italic
     * @param text
     * @return
     */
    public static String italic(String text){
        return"<i>"+text+"</i>";
    }

    /**
     * Emphasizes text
     * @param text
     * @return
     */
    public static String emphasize(String text){
        return "<em>"+text+"</em>";
    }

    /**
     * Marks text
     * @param text
     * @return
     */
    public static String marked(String text){
        return "<mark>"+text+"</mark>";
    }

    /**
     * Makes text small
     * @param text
     * @return
     */
    public static String small(String text){
        return "<small>"+text+"</small>";
    }

    /**
     * Sets text to deleted
     * @param text
     * @return
     */
    public static String deleted(String text){
        return "<del>"+text+"</del>";
    }

    /**
     * Sets text to inserted
     * @param text
     * @return
     */
    public static String inserted(String text){
        return "<ins>"+text+"</ins>";
    }

    /**
     * Sets text as subscript
     * @param text
     * @return
     */
    public static String subscript(String text){
        return "<sub>"+text+"</sub>";
    }

    /**
     * Sets text as superscript
     * @param text
     * @return
     */
    public static String supscript(String text){
        return "<sup>"+text+"</sup>";
    }

    /**
     * Gives text Preformatted styling
     * @param text
     * @return
     */
    public static String preformatted(String text){
        return "<pre>"+text+"</pre>";
        
    }

    /**
     * Sets text as code
     * @param text
     * @return
     */
    public static String code(String text){
         return "<code>" +text + "</code>";
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