package HTML.LowLevel.ILowLevel;

import HTML.LowLevel.Element.Element;

public interface Builder {

    Element build();

    default void verify() {

    }
}
