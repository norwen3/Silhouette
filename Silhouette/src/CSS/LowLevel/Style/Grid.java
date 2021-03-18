package CSS.LowLevel.Style;

import CSS.LowLevel.ILowLevel.IAlignment;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Specifies a CSS Grid.
 */
public class Grid extends RuleSet implements IAlignment {

    // Constructor

    /**
     * Initiates with one or more selectors
     * @param selector Any type of CSS selector
     */
    public Grid(String selector){
        super(selector);
        setDisplay("grid");
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
        setDisplay("grid");
    }

    // Public Methods

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

    public void setRowGap(String value){
        addRule("grid-row-gap", value);
    }

    public void setColumnGap(String value){
        addRule("grid-column-gap", value);
    }

    public void setGap(String value){
        addRule("grid-gap", value);
    }

    public void setJustifySelf(String value){
        addRule("justify-self", value);
    }

    public void setJustifyItems(String value){
        addRule("justify-items", value);
    }

    public void setTemplateAreas(String... values){
        String rule = combineValuesWithSeparator(" ", values);
        addRule(rule);
    }

    /**
     * Shorthand for grid-template-columns, grid-template-rows and grid-template-areas. Seperated by / sign
     * @param values
     */
    public void setTemplate(String... values){
        String rule = combineValuesWithSeparator(" / ", values);
        addRule(rule);
    }

    public void addArea(String areaName, int rowStart, int rowEnd, int colStart, int colEnd){
        // @TODO: Figure this out
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