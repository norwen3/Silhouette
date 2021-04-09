package CSS.HighLevel.Implementation;

import java.util.Arrays;
import java.util.Iterator;

public abstract class CSSManager {

    public static String combineValuesWithSeparator(String separator, String[] values) {
        StringBuilder str = new StringBuilder();

        Iterator<String> valueIterator = Arrays.asList(values).iterator();
        while (valueIterator.hasNext()){

            str.append(valueIterator.next());

            if (valueIterator.hasNext()){
                str.append(separator);
            }
        }

        return str.toString();
    }
}
