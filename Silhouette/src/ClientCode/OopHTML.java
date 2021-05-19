package ClientCode;

import HTML.BaseComponents.Element.Container;
import HTML.BaseComponents.Element.Paragraph;
import HTML.BaseComponents.HTML;

public class OopHTML {
    public static void main(String[] args) {
        Container.Builder articleBuilder = new Container.Builder();

        int amount = 10;
        for (int i = 1; i <= amount; i++) {
            Paragraph p = new Paragraph.Builder().setText("Paragraph " + i).build();
            articleBuilder.addElements(p);
        }

        Container article = articleBuilder.build();

        HTML builder = new HTML.Builder()
                .addElements(article)
                .build();

        builder.initialize("index.html");
    }
}
