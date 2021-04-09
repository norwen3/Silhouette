package StyleSheets;

import StyleSheets.BaseComponents.Implementation.IAlignment;
import StyleSheets.BaseComponents.RuleSet;

public class FlexBox extends RuleSet implements IAlignment {

    // Constructor

    /**
     * Initiates with one or more selectors
     * @param selector Any type of CSS selector
     */
    public FlexBox(String selector){
        super(selector);
        setDisplay("flex");
    }

    // Methods

    public void setFlexDirection(String value){
        addRule("flex-direction", value);
    }

    public void setFlexWrap(String value){
        addRule("flex-wrap", value);
    }

    public void setFlexFlow(String value){
        addRule("flex-flow", value);
    }

    public void setFlexGrow(String value){
        addRule("flex-grow", value);
    }

    public void setFlexShrink(String value){
        addRule("flex-shrink", value);
    }

    public void setFlexBasis(String value){
        addRule("flex-basis", value);
    }

    public void setFlex(String value){
        addRule("flex", value);
    }

    // Override methods

    @Override
    public void setAlignItems(String value) {
        addRule("align-items", value);
    }

    @Override
    public void setAlignSelf(String value) {
        addRule("align-self", value);
    }

    @Override
    public void setJustifyContent(String value) {
        addRule("justify-content", value);
    }

    @Override
    public void setAlignContent(String value) {
        addRule("align-content", value);
    }
}
