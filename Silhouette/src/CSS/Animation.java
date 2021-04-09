package CSS;

import CSS.BaseComponents.Implementation.Statement;
import CSS.BaseComponents.AtRule;

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
