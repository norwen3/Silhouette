package StyleSheets.BaseComponents;

import java.io.IOException;
import java.util.ArrayList;

public class StyleSheet {

    // Instance variables

    private final String fileName;
    private final String rawCSS;
    private final ArrayList<Statement> statements;

    // Constructor

    private StyleSheet(Builder builder) {
        fileName = builder.fileName;
        statements = builder.statements;
        rawCSS = builder.rawCSS;
    }

    public void initialize() {
        StyleSheetCompiler.compile(this);
    }

    public String getFileName() {
        return fileName;
    }

    public String getRawCSS() {
        return rawCSS;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public static class Builder {

        private String fileName = "main";
        private String rawCSS = "";
        private ArrayList<Statement> statements = new ArrayList<>();

        // Public Methods

        public Builder applyStyle(final Statement statements) {
            this.statements.add(statements);
            return this;
        }

        public Builder setFileName(final String fileName){
            this.fileName = fileName;
            return this;
        }

        public Builder normalize() {
            String str = StyleManager.readFile("src/StyleSheets/BaseComponents/Resources/normalize.css");

            if (str != null) {
                rawCSS = str;
            }

            return this;
        }

        public StyleSheet build() {
            return new StyleSheet(this);
        }
    }
}
