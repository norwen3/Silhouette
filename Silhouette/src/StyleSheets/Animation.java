package StyleSheets;

import StyleSheets.BaseComponents.Implementation.Statement;
import StyleSheets.BaseComponents.AtRule;

public class Animation extends AtRule {
    //public void
    public Animation(String name){
        super("keyframes", "name");

    }

    public void AddKeyframe(String name){

    }

    public class Keyframe extends Statement {
        public Keyframe(String name)
        {
            identifier = name;
        }
    }
}
