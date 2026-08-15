public  class Smartphone  implements VideoPlayer, MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("o smartphone está rodando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("o smartphone pausou o video");

    }

    @Override
    public void stopVideo() {
        System.out.println("o smartphone parou o video");

    }

    @Override
    public void playMusic() {
        System.out.println("o smartphone esta tocando a musica");

    }

    @Override
    public void pauseMusic() {
        System.out.println("o smartphone pausou a musica");

    }

    @Override
    public void stopMusic() {
        System.out.println("o smartphone parou o musica");

    }
}
