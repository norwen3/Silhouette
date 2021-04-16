import HTML.LowLevel.Component.HTML;
import HTML.LowLevel.Element.Container;
import HTML.LowLevel.Element.Input;

public class Scenario8 {
    public static void main(String[] args) {
        HTML myPage = new HTML();

        Container body = new Container.Builder()
                .setType("body")
                .build();

        Input questions1 = new Input
                .Builder("Radio", "male","gender", "Male");



        myPage.append(body);
    }
}
