package HTML.LowLevel.Element;

import HTML.LowLevel.ILowLevel.IDimensions;
import HTML.LowLevel.ILowLevel.ISource;

// Video Tag
// Source tag auto generates
public class Video implements IDimensions, ISource {
    /* Width og Height kan vel være i en?
    public void setVideoBoxSize(int width, int height) {}
     */

    @Override //int ? width="320"
    public void setWidth(String dimension) {

    }

    @Override //int ? height="240"
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

https://www.w3schools.com/tags/tag_video.asp
 */