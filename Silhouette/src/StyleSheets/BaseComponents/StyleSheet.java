package StyleSheets.BaseComponents;

import java.util.ArrayList;

/**
 * Defines a cascading stylesheet that contains CSS statements.
 * The StyleSheet class will generate a formatted CSS file containing the field data.
 * One or more stylesheets can be used for a single HTML page or throughout the whole website.
 */
public class StyleSheet {

    /**
     * The file name ending with the .css extension.
     */
    private final String fileName;
    /**
     * The folder where the stylesheet will be saved.
     * The default location is "WebFiles/"
     */
    private final String outputFolder;
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
        fileName = builder.fileName;
        outputFolder = builder.outputFolder;
        statements = builder.statements;
        rawCSS = builder.rawCSS;
    }

    /**
     * Compiles the stylesheet into a CSS file.
     */
    public void initialize() {
        StyleSheetCompiler.compile(this);
    }

    /**
     * Gets the file name of the stylesheet.
     * @return String
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Gets the output folder of the stylesheet.
     * @return String
     */
    public String getOutputFolder() {
        return outputFolder;
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
         * @see StyleSheet#fileName
         */
        private String fileName;
        /**
         * @see StyleSheet#outputFolder
         */
        private String outputFolder = "";
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
         * @param fileName the file name
         */
        public Builder(final String fileName) {
            this.fileName = fileName;
        }

        /**
         * Constructor for stylesheet builder.
         * @param fileName the file name
         * @param outputFolder the output folder
         */
        public Builder(final String fileName, final String outputFolder) {
            this.fileName = fileName;
            this.outputFolder = outputFolder;
        }

        /**
         * Adds a statement to the stylesheet.
         * @param statement the statement to be added to the list of statements
         * @return builder of generic type for stylesheets
         */
        public Builder applyStyle(final Statement statement) {
            this.statements.add(statement);
            return this;
        }

        /**
         * Normalizes the stylesheet using normalize.css v8.0.1 provided by Necolas.
         * @return builder of generic type for stylesheets
         */
        public Builder normalize() {
            String str = StyleManager.readFile("src/StyleSheets/BaseComponents/Resources/normalize.css");
            if (str != null) {
                rawCSS = str;
            }
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
