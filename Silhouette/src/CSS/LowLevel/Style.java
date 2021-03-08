package CSS.LowLevel;

import java.util.List;

public class Style {
    public void setId(String idName){}
    public void setClass(String className){}
    public void addRule(String declaration){} // e.g. Background-color: Blue
    public void addDeclaration(Declaration declaration){}
    public void addRule(List<String> declarations){}
    public void addDeclarations(List<Declaration> declarations){}
}


/*
Eggsample Tree
Style myColor = new Style();
myColor.addDeclaration(Color.setRGB("Background-color", 255, 255, 255));

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