package StyleSheets.BaseComponents;

import StyleSheets.BaseComponents.Implementation.Statement;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

/**
 * Defines a CSS rule set containing a selector and multiple declarations.
 */
public class RuleSet extends Statement {

    // Constructors

    private RuleSet(Builder builder){
        identifier = builder.identifier;
        rules = builder.rules;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public static class Builder {
        public String identifier;

        public ArrayList<String> rules = new ArrayList<>();

        public Builder setSelector(String selector) {
            identifier = selector;
            return this;
        }

        public Builder addRule(String css) {
            rules.add(css);
            return this;
        }

        public Builder addRule(Property property, String value) {
            addRule(propertyToString(property) + ": " + value + ";");
            return this;
        }

        public Builder addRule(Property property, Color color) {
            addRule(propertyToString(property) + ": " + colorToString(color) + ";");
            return this;
        }

        public RuleSet build() {
            return new RuleSet(this);
        }
    }


    // Methods

    /* @TODO: Use a single method with enums instead
    public void setSelector(String selector){
        identifier = selector;
    }

    public void setDisplay(String value){
        rules.add("display: " + value);
    }

    public void setWidth(String value){
        rules.add("width: " + value);
    }

    public void setHeight(String value){
        rules.add("height: " + value);
    }

    public void setMargin(String value){
        rules.add("margin: " + value);
    }

    public void setBorder(String value){
        rules.add("border: " + value);
    }

    public void setPadding(String value){
        rules.add("padding: " + value);
    }

    public void setContent(String value){
        rules.add("content: " + value);
    }

    public void setPosition(String value){
        rules.add("position: " + value);
    }

    public void setFloat(String value){
        rules.add("float: " + value);
    }

    public void setTop(String value){
        rules.add("top: " + value);
    }

    public void setBottom(String value){
        rules.add("bottom: " + value);
    }
    */
}