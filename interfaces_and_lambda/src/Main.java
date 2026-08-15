public class Main{
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new Smartphone();
        runMusic(musicPlayer);
        runVideo(new Computer());
    }


    static void runVideo(VideoPlayer videoPlayer) {

        videoPlayer.playVideo();
    }

    static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }
}