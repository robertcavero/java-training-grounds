public interface MusicPlayer {

    /*
     * Uma interface define um contrato de comportamento para as classes
     * que a implementam.
     *
     * Ela não representa uma implementação, mas sim um conjunto de
     * métodos que obrigatoriamente deverão ser implementados.
     *
     * Qualquer classe ou record que utilizar "implements MusicPlayer"
     * deverá fornecer uma implementação para todos os métodos abaixo.
     *
     * Isso permite que diferentes classes tenham o mesmo comportamento,
     * mesmo que suas implementações sejam diferentes.
     *
     * Exemplo:
     * - MusicBox pode tocar músicas armazenadas localmente.
     * - SpotifyPlayer pode tocar músicas via streaming.
     * - RadioPlayer pode reproduzir uma estação de rádio.
     *
     * Todos implementam MusicPlayer, mas cada um executa as ações de
     * acordo com sua própria lógica.
     */

    /*
     * Diferença entre Record e Interface:
     *
     * - Record é um tipo de classe utilizado para representar dados.
     *   Ele possui atributos, construtor, getters, equals(), hashCode()
     *   e toString() gerados automaticamente pelo compilador.
     *
     * - Interface não representa um objeto nem armazena dados.
     *   Ela apenas define um contrato, ou seja, especifica quais
     *   métodos uma classe ou record deve implementar.
     *
     * Um record (ou uma classe) pode implementar uma interface para
     * adquirir esse contrato de comportamento.
     *
     * Exemplo:
     *
     *     public record MusicBox(String music, boolean isPaused)
     *             implements MusicPlayer { ... }
     *
     * O record MusicBox continua sendo responsável pelos seus dados
     * (music e isPaused), enquanto a interface MusicPlayer apenas
     * obriga que ele implemente os métodos abaixo.
     *
     * Dessa forma, diferentes classes ou records podem implementar
     * MusicPlayer e reproduzir músicas de maneiras diferentes,
     * mantendo a mesma "regra" de funcionamento.
     */


     void playMusic();

     void pauseMusic();

     void stopMusic();
}

