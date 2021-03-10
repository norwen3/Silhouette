package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.IDimensions;
import HTML.LowLevel.ILowLevel.ISource;

// Video Tag
// Source tag auto generates
public class Video implements IDimensions, ISource {

    @Override
    public void setWidth(String dimension) {

    }

    @Override
    public void setHeight(String dimension) {

    }

    @Override
    public void addSource(String source, String type){
        // <source src="movie.mp4" type="video/mp4">
    }
}

/*

<video width="320" height="240" controls>
  <source src="movie.mp4" type="video/mp4">
  <source src="movie.ogg" type="video/ogg">
  Your browser does not support the video tag.
</video>

 */