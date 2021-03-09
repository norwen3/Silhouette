package CSS.LowLevel.Style;

public class RuleSet {
    public void setId(String idName){}
    public void setClass(String className){}
    public void setSelector(String value){}
    public void setAtRule(String atRule){
        // @keyframes, @media
        // https://developer.mozilla.org/en-US/docs/Web/CSS/At-rule
    }

    // Add rules
    public void addRule(String css){
        // Straight up CSS
        // e.g. Background-color: Blue
    }
    public void addRule(String property, String value){
        // Do like this:
        // myColor.addRule("Background-color", "red");
        //
        // Or like this:
        // myColor.addRule("Background-color", Color.RGB(211, 22, 3));
    }

    public void setDisplay(String value){}

    // Box Model
    public void setWidth(String value){}
    public void setHeight(String value){}
    public void setMargin(String value){}
    public void setBorder(String value){}
    public void setPadding(String value){}
    public void setContent(String value){}

    // Alignment
    public void setPosition(String value){}
    public void setFloat(String value){}
    public void setTop(String value){}
    public void setBottom(String value){}

    // Apply to Child elements
    public void applyToNthChild(int n, String value){
        // .myAmazingClass:nth-child(n);
    }
}




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


Eggsample 2
Style colorBlue = new Style();
colorBlue.setClass("BlueClass");
colorBlue.addDeclaration("Background-color:Blue");

colorBlue.addDeclaration(Grid.setColumns("10px", "12px"))
colorBlue.addDeclaration(Grid.setRows("10px", "12px"))

Color colorGreen = new Color();
colorGreen.setValueRGB(23, 52, 12);
colorGreen.setProperty("Background-color");


colorBlue.addDeclaration(colorGreen);

Header myHeader = new Header();
myHeader.applyClass("BlueClass");

-->
<header class="BlueClass" ></header>


Example 1

Style colorBlue = new Style("Background-color:Blue");
colorBlue.addStyling("border-color: Blue");
colorBlue.addStyling("Float:left");

Style floatLeft = new Style("Float:Left");

Header myHeader = new Header();
Footer myFooter = new Footer();

myHeader.applyStyle(colorBlue);
myFooter.applyStyle(colorBlue);
myFooter.applyStyle(floatLeft);

myHeader.applyClass();
myHeader.applyClasses()


-->
<header class="colorBlue"></header>
<footer class="colorBLue floatLeft"></header>


 */