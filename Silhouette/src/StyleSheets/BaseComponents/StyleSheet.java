package StyleSheets.BaseComponents;

import StyleSheets.BaseComponents.Implementation.Statement;

import java.util.ArrayList;

public class StyleSheet {

    // Instance variables

    private final String fileName;
    private final ArrayList<Statement> statements;

    // Constructor

    private StyleSheet(Builder builder) {
        fileName = builder.fileName;
        statements = builder.statements;
    }

    // Getters

    public String getFileName() {
        return fileName;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }

    public void Initialize() {
        StyleSheetCompiler.compile(this);
    }

    public static class Builder {

        private String fileName = "main";
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
            // @TODO: Implement this
            return this;
        }

        public StyleSheet build() {
            return new StyleSheet(this);
        }
    }
}
