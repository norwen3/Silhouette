package CSS.LowLevel.Style;

import CSS.LowLevel.ILowLevel.IAlignment;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Specifies a CSS Grid.
 */
public class Grid extends RuleSet implements IAlignment {

    // Instance Variables

    // Constructor

    /**
     * Initiates with one or more selectors
     * @param selector Any type of CSS selector
     */
    public Grid(String selector){
        super(selector);
    }

    /**
     * Initiates with selector, columns and rows.
     * @param selector Any type of CSS selector
     * @param columns Sets the columns
     * @param rows Sets the rows
     */
    public Grid(String selector, String columns, String rows){
        super(selector);
        setColumns(columns);
        setRows(rows);
    }

    // Methods

    public void setColumns(String columns){
        addRule("grid-template-columns", columns);
    }
    public void setRows(String rows){
        addRule("grid-template-rows", rows);
    }
    public void setAutoColumns(String value){
        addRule("grid-auto-columns", value);
    }
    public void setAutoRows(String value){
        addRule("grid-auto-rows", value);
    }
    public void setAutoFlow(String value){
        addRule("grid-auto-flow", value);
    }
    public void addArea(String areaName, int rowStart, int rowEnd, int colStart, int colEnd){

    }
    /**
     * Shorthand for grid-template-columns, grid-template-rows and grid-template-areas. Seperated by / sign
     * @param values
     */
    public void setTemplate(String... values){
        StringBuilder str = new StringBuilder();

        Iterator<String> valueIterator = Arrays.asList(values).iterator();
        while (valueIterator.hasNext()){

            str.append(valueIterator.next());

            if (valueIterator.hasNext()){
                str.append(" / ");
            }
        }

        addRule(str.toString());
    }
    public void setRowGap(String value){}
    public void setColumnGap(String value){}
    public void setGap(String value){}
    public void setJustifySelf(String value){}
    public void setJustifyItems(String value){}

    // Override methods

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