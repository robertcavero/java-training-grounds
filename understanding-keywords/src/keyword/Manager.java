package keyword;

/*
Atributo protected só pode ser usado em duas ocasiões:
Sua classe está herdando a classe com os atributos protected ou
sua classe tem que estar no mesmo package
Private é o mais restritivo de todos
 */

public class Manager extends Client{
    public Manager(){
        this.setName("Mario");
    }
}
