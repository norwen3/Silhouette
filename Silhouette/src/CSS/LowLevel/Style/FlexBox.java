package CSS.LowLevel.Style;

import CSS.LowLevel.ILowLevel.IAlignment;

// Flexbox
// This automatically sets "Display: Grid";
public class FlexBox extends RuleSet implements IAlignment {
    // Ordering and orientation
    public void setFlexDirection(String value){
        // row, row-reverse, column, column-reverse
    }
    public void setFlexWrap(String value){
        // nowrap, wrap, wrap-reverse
    }
    public void setFlexFlow(String value){
        // Combination of flex-wrap and flex-direction
        // Maybe unecessary?
    }

    // Flexibility
    public void setFlexGrow(String value){
        // a number value
    }
    public void setFlexShrink(String value){}
    public void setFlexBasis(String value){}
    public void setFlex(String value){}

    // Alignment

    @Override
    public void setAlignItems(String value) {

    }

    @Override
    public void setAlignSelf(String value) {

    }

    @Override
    public void setJustifyContent(String value) {

    }

    @Override
    public void setAlignContent(String value) {

    }
}
