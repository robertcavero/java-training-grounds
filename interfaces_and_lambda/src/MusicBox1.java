public  class MusicBox1 implements MusicPlayer{

    @Override
    public void playMusic() {
        System.out.println("o caixa de musica esta tocando a musica");

    }

    @Override
    public void pauseMusic() {
        System.out.println("o caixa de musica pausou a musica");

    }

    @Override
    public void stopMusic() {
        System.out.println("o caixa de musica parou o musica");

    }
}
