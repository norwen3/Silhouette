package CSS.LowLevel;

import CSS.HighLevel.RuleSet;

import java.util.ArrayList;
import java.util.Arrays;

public class StyleSheet {

    // Instance variables

    private String fileName;
    private ArrayList<Statement> statements = new ArrayList<>();

    // Constructor

    public StyleSheet(String fileName){
        setFileName(fileName);
    }

    public StyleSheet(String fileName, RuleSet... statements){
        this.fileName = fileName;
        this.statements.addAll(Arrays.asList(statements));
    }

    // Public Methods

    public void applyStyle(Statement statements){
        this.statements.add(statements);
    }

    public void applyStyles(Statement... statements){
        this.statements.addAll(Arrays.asList(statements));
    }

    // Getters and setters

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public ArrayList<Statement> getStatements() {
        return statements;
    }
}
