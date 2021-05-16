package StyleSheets.BaseComponents;

import StyleSheets.BaseComponents.Implementation.Statement;

/**
 * Defines a CSS rule set containing a selector and multiple declarations.
 */
public class RuleSet extends Statement {

    // Constructors

    /**
     * Initiates with one or more selectors
     * @param selector Any type of CSS selector
     */
    public RuleSet(String selector){
        // All selector types
        setSelector(selector);
    }

    // Methods

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
}

/* https://www.w3schools.com/cssref/css3_pr_mediaquery.asp
    @media only screen and (max-width: 600px) {
  body {
    background-color: lightblue;
  }
}
 */


/*
Eggsample Fore
Style myColor = new Style();
myColor.addDeclaration("Background-color", Color.RGB(211, 22, 3));

Style mySecondColor = new Style();
myColor.addDeclaration("", Color.RGB(12, 32, 4));
-> Equivalent to myColor.addDeclaration("Color", Color.RGB(12, 32, 4));


Eggsample Tree
Style myColor = new Style();
myColor.addDeclaration(Color.setRGB("Background-color", 255, 255, 255));
myColor.addDeclaration("background-color", Color.RGB(255, 255, 255));

Grid myGrid = new Grid();
myGrid.addDeclaration(Color.setRGB("Background-color", 255, 255, 255));
myGrid.setColumns("15px", "10px", "200000em");
myGrid.setRows("1px", "2px", "3px");
myGrid.addArea("searchbar", 1, 2, 3, 4);

 */