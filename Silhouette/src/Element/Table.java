package Element;

public class Table {
    // row x column
    public void setSize(int row, int column){}
    public void setCaption(String caption){}
    public void setColgroup(ColGroup colgroup){}

    // Insert methods
    public void insertHead(int row, int column, String text){}
    public void insertHead(int row, int column, Element element){}
    public void insertNormal(int row, int column, String text){}
    public void insertNormal(int row, int column, Element element){}
    public void insertFoot(int row, int column, String text){}
    public void insertFoot(int row, int column, Element element){}
}
