package StyleSheets.BaseComponents;

import StyleSheets.BaseComponents.Implementation.Statement;
import StyleSheets.BaseComponents.Implementation.StyleManager;
import StyleSheets.Values.Color;
import StyleSheets.Values.Property;

import java.util.ArrayList;

/**
 * Defines a CSS rule set containing a selector and multiple declarations.
 */
public class RuleSet extends Statement {

    // Constructors

    protected RuleSet(final Builder<?> builder){
        identifier = builder.identifier;
        rules = builder.rules;
    }

    public String getIdentifier() {
        return identifier;
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public static class Builder <T extends Builder<T>>{
        public String identifier;

        public ArrayList<String> rules = new ArrayList<>();

        public T setSelector(String selector) {
            identifier = selector;
            return (T)this;
        }

        public T addRule(String css) {
            rules.add(css);
            return (T)this;
        }

        public T addRule(Property property, String value) {
            addRule(StyleManager.stringifyEnum(property) + ": " + value + ";");
            return (T)this;
        }

        public T addRule(Property property, Color color) {
            addRule(StyleManager.stringifyEnum(property) + ": " + StyleManager.colorToString(color) + ";");
            return (T)this;
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