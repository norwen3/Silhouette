package CSS.LowLevel;

import CSS.LowLevel.Style.RuleSet;

import java.util.ArrayList;
import java.util.Arrays;

public class StyleSheet {

    // Instance variables

    private String fileName;
    private ArrayList<RuleSet> ruleSets = new ArrayList<>();

    // Constructor

    public StyleSheet(String fileName){
        setFileName(fileName);
    }

    public StyleSheet(String fileName, RuleSet... ruleSets){
        setFileName(fileName);
        this.ruleSets.addAll(Arrays.asList(ruleSets));
    }

    // Public Methods

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public void applyStyle(RuleSet ruleSet){
        this.ruleSets.add(ruleSet);
    }

    public void applyStyles(RuleSet... ruleSets){
        this.ruleSets.addAll(Arrays.asList(ruleSets));
    }

    // Getters and setters

    public String getFileName() {
        return fileName;
    }

    public ArrayList<RuleSet> getRuleSets() {
        return ruleSets;
    }
}
