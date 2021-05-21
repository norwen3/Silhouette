package HTML.BaseComponents.ILowLevel;

import HTML.BaseComponents.Element.Element;

import java.util.HashMap;
import java.util.Map;

public interface IBuilder {
    Map<String, String> attributes = new HashMap<>();
    Element build();

    //Use this to add key-value pairs. First string value will be a key in a map, second string will be a value
    default IBuilder addAttributes(String... keyValuePairs){
        int count= 0;
        String tempKey = keyValuePairs[0];
        for(String s:keyValuePairs){
            if(count % 2 ==0){
                tempKey = s;
            }else{
                this.attributes.put(tempKey,s);
            }
            count++;
        }
        return this;
    }




}
