package StyleSheets.BaseComponents;

import java.util.ArrayList;

/**
 * Defines a cascading stylesheet that contains CSS statements.
 * The StyleSheet class will generate a formatted CSS file containing the field data.
 * One or more stylesheets can be used for a single HTML page or throughout the whole website.
 */
public class StyleSheet {
    /**
     * Raw CSS that in String format that will be applied to the CSS file.
     */
    private final String rawCSS;
    /**
     * Statement objects that will be applied to the CSS file.
     */
    private final ArrayList<Statement> statements;

    /**
     * Constructor used by builder to build a new StyleSheet object.
     * @param builder the builder for rule set
     */
    private StyleSheet(Builder builder) {
        statements = builder.statements;
        rawCSS = builder.rawCSS;
    }

    /**
     * Compiles the stylesheet into a CSS file.
     * @param fileName The file name ending with the .css extension.
     */
    public void initialize(String fileName) {
        StyleSheetCompiler.compile(this, fileName, "");
    }

    /**
     * Compiles the stylesheet into a CSS file.
     * @param fileName The file name ending with the .css extension.
     * @param outputFolder The folder where the stylesheet will be saved.
     */
    public void initialize(String fileName, String outputFolder) {
        StyleSheetCompiler.compile(this, fileName, outputFolder);
    }

    /**
     * gets the raw CSS as String.
     * @return String
     */
    public String getRawCSS() {
        return rawCSS;
    }

    /**
     * Gets the list of statements.
     * @return ArrayList<Statement>
     */
    public ArrayList<Statement> getStatements() {
        return statements;
    }

    /**
     * The builder class for the stylesheet.
     * It is an inner static class used to build an immutable instance of a StyleSheet object.
     */
    public static class Builder {

        /**
         * @see StyleSheet#rawCSS
         */
        private String rawCSS = "";
        /**
         * @see StyleSheet#statements
         */
        private ArrayList<Statement> statements = new ArrayList<>();

        /**
         * Constructor for stylesheet builder.
         */
        public Builder() {
        }

        /**
         * Adds a statement to the stylesheet.
         * @param statement the statement to be added to the list of statements
         * @return builder of generic type for stylesheets
         */
        public Builder addStatement(final Statement statement) {
            this.statements.add(statement);
            return this;
        }

        /**
         * Builds the stylesheet and returns it.
         * @return StyleSheet constructed by the builder
         */
        public StyleSheet build() {
            return new StyleSheet(this);
        }
    }
}
