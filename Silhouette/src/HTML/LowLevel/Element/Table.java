package HTML.LowLevel.Element;

public class Table {
    // row x column
    public void setSize(int row, int column){}
    public void setCaption(String caption){}
    public void setColgroup(ColGroup colgroup){}

    // Insert methods
    public void insertHead(int row, int column, String text){
        // <thead>
        //    <tr><td>January</td></tr>
        // </thead>
    }
    public void insertHead(int row, int column, Element element){
        // <thead>
        //    <tr><td>January</td></tr>
        // </thead>
    }
    public void insertValue(int row, int column, String text){
        // <tbody>
        //    <tr><td>January</td></tr>
        // </tbody>
    }
    public void insertValue(int row, int column, Element element){
        // <tbody>
        //    <tr><td>January</td></tr>
        // </tbody>
    }
    public void insertFoot(int row, int column, String text){
        // <tfoot>
        //    <tr><td>January</td></tr>
        // </tfoot>
    }
    public void insertFoot(int row, int column, Element element){
        // <tfoot>
        //    <tr><td>January</td></tr>
        // </tfoot>
    }
}
