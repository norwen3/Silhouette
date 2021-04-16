package HTML.BaseComponents.ILowLevel;


// <img width="100px" height="100px" />
// width and height attributes are different from css width and height
// These tags supports width and height attributes:
// canvas, embed, iframe, img, input, object, video
public interface IDimensions {
    IBuilder setWidth(String dimension);
    IBuilder setHeight(String dimension);
}
