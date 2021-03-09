package CSS.LowLevel.Style;

import CSS.LowLevel.IAlignment;

// Specifies a grid
// This automatically sets "Display: Grid" if no value is set in constructor;
// Consturctor takes three values grid, inline-grid, subgrid
public class Grid extends Style implements IAlignment {
    // Defining the Grid
    public void setDisplay(String value){}
    public void setColumns(String... columns){
        // e.g. 15px 10px 2em 4fr etc..
    }
    public void setAutoColumns(String column){}
    public void setRows(String... rows){}
    public void setAutoRows(String row){}
    public void setAutoFlow(String value){}
    public void addArea(String areaName, int rowStart, int rowEnd, int colStart, int colEnd){}
    public void setTemplate(String... args){
        // Shorthand for grid-template-columns, grid-template-rows and grid-template-areas
        // Separated by / sign
    }

    // Spacing
    public void setRowGap(String value){}
    public void setColumnGap(String value){}
    public void setGap(String value){}

    // Alignment
    public void setJustifySelf(String value){}
    public void setJustifyItems(String value){}

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