import HTML.LowLevel.Component.HTML;
import HTML.LowLevel.Element.Container;
import HTML.LowLevel.Element.Video;

public class Scenario7 {
    public static void main(String[] args){
        HTML myPage = new HTML();

        Container body = new Container.Builder()
                .setType("body")
                .build();

        Video myVideo = new Video();
        myVideo.setHeight("200"); //px
        myVideo.setWidth("400"); //px
        myVideo.addSource("movie.mp4", "video/mp4");
        myVideo.addSource("movie.ogg", "video/ogg");
        myVideo.addSource("movie.webm", "video/webm");

        //????? se under
        //Your browser does not support the video tag.

        myPage.append(body);
    }
}
/*
https://www.w3schools.com/tags/tag_video.asp
 */