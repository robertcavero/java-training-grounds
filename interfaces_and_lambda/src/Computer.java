public  class Computer implements VideoPlayer, MusicPlayer{

    @Override
    public void playVideo() {
        System.out.println("o computer está rodando o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("o computer pausou o video");

    }

    @Override
    public void stopVideo() {
        System.out.println("o computer parou o video");

    }

    @Override
    public void playMusic() {
        System.out.println("o computer esta tocando a musica");

    }

    @Override
    public void pauseMusic() {
        System.out.println("o computer pausou a musica");

    }

    @Override
    public void stopMusic() {
        System.out.println("o computer parou o musica");

    }
}
