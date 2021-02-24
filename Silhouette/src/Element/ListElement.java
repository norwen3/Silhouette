package Element;

import java.util.ArrayList;
import java.util.List;

public class ListElement extends OpenClosed {

    String listItem;
    List<String> items = new ArrayList<>();
    Boolean isOrdered;

    public ListElement(List<String>items, Boolean isOrdered) {
        this.items = items;
        this.isOrdered = isOrdered;
    }

    //adds listItem to ListElement
    public void addListItem(String item){
        items.add(item);
    }
}
