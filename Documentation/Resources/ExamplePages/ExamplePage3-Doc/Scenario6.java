import HTML.LowLevel.Component.HTML;
import HTML.LowLevel.Element.Container;
import HTML.LowLevel.Element.Format;
import HTML.LowLevel.Element.Heading;
import HTML.LowLevel.Element.ListElement;

public class Scenario6 {

    public static void main(String[] args) {

        HTML myPage = new HTML();
        Container body = new Container.Builder()
                .setType("body")
                .build();


        Container main = new Container.Builder()
                .setType("main")
                .build();

        Container artical = new Container.Builder()
                .setType("artical")
                .build();

        Heading h2 = new Heading.Builder(2, "Lisa Østerås").build();
                                            //????
        ListElement unorder = new ListElement(, false);
        unorder.addListItem("First Name : Lisa");
        unorder.addListItem("Last Name : Østerås");
        unorder.addListItem("Age : 27");
        unorder.addListItem(Format.bold("Lisa123mail@mail.com"));


        myPage.append(body);
        body.addElement(main);
        main.addElement(artical);
        artical.addElement(h2);
        artical.addElement(unorder);
    }
}
