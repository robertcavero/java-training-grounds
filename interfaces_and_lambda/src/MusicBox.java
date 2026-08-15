public record MusicBox(String music, boolean isPaused) implements MusicPlayer{

    /*
     * Records possuem algumas características importantes:
     *
     * 1. Todo record herda automaticamente da classe java.lang.Record.
     *    Como Java não permite herança múltipla de classes, um record
     *    não pode estender outra classe ou classe abstrata.
     *
     * 2. Os componentes do record (music e isPaused) são imutáveis
     *    (final), ou seja, seus valores não podem ser alterados após
     *    a criação do objeto.
     *
     * 3. Apesar de não poder herdar de outra classe, um record pode
     *    implementar uma ou mais interfaces normalmente.
     *
     * Neste exemplo, MusicBox implementa a interface MusicPlayer,
     * assumindo o compromisso de implementar todos os métodos
     * declarados pela interface (playMusic, pauseMusic e stopMusic).
     */

    /*
     * PROPÓSITO DA INTERFACE:
     *
     * Uma interface existe para definir um contrato de comportamento.
     * Ela informa "o que um objeto deve saber fazer", mas não se
     * preocupa com os dados que esse objeto possui nem com a forma
     * como esse comportamento será executado.
     *
     * Neste caso, MusicPlayer define que qualquer objeto que seja um
     * "reprodutor de música" obrigatoriamente deve possuir as ações:
     *
     * - tocar música;
     * - pausar música;
     * - parar música.
     *
     * A interface permite que diferentes tipos de objetos tenham o
     * mesmo comportamento esperado.
     *
     * Exemplo:
     *
     * MusicBox, SpotifyPlayer e RadioPlayer podem implementar
     * MusicPlayer, mas cada um terá sua própria forma de executar
     * playMusic(), pauseMusic() e stopMusic().
     *
     *
     * DIFERENÇA PARA UM RECORD:
     *
     * Um record tem como propósito representar dados.
     * Ele é usado quando queremos criar objetos imutáveis que apenas
     * armazenam informações.
     *
     * Exemplo:
     *
     * public record MusicBox(String music, boolean isPaused)
     *
     * O record representa o estado de uma caixa de música:
     * - qual música está carregada;
     * - se está pausada ou não.
     *
     * Já a interface MusicPlayer não guarda nenhuma informação.
     * Ela apenas define quais comportamentos uma classe ou record
     * precisa oferecer.
     *
     * Resumindo:
     *
     * Record     -> representa dados/estado de um objeto.
     * Interface  -> representa comportamentos que um objeto deve ter.
     *
     * O record MusicBox usa a interface MusicPlayer para dizer:
     *
     * "Eu sou um objeto que possui esses dados e também sei executar
     * os comportamentos de um MusicPlayer."
     */


    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void stopMusic() {

    }
}
