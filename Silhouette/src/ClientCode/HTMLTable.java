package ClientCode;

import HTML.BaseComponents.Element.ColGroup;
import HTML.BaseComponents.Element.Table;
import HTML.BaseComponents.HTML;
import HTML.Component.Page;

public class HTMLTable {
    public static void main(String[] args) {
        Table myTable = new Table.Builder(4, 4)
                .setCaption("MyTable")
                .insertHeaders( 0, "Column 1", "Column 2", "Column 3", "Column 4")
                .insert(        1, "Text", "Text", "Text", "Text")
                .insert(        2, "Text", "Text", "Text", "Text")
                .insertFoot(    3, "Text", "Text", "Text", "Text")
                .build();

        HTML myPage = new HTML.Builder()
                .append(myTable)
                .build();

        myPage.initialize("index");
    }
}
