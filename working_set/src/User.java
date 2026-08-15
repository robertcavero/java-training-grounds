import java.util.Objects;

import static java.util.Objects.hash;
import static java.util.Objects.isNull;

public class User implements Comparable<User> {
    private  int id;
    private  String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
     toString and Equals referenciavam o endereço de memória
     do objeto, ou seja, cada vez que você instanciasse o objeto
     estaria a referenciar ao endereço de memória e então nenhum
     objeto seria igual por conta disso e o Equals nunca ia dar certo
     a menos que você comparasse uma instância com ela mesma, ou seja,
     mesmo hash.
     */

    @Override
    public String  toString(){
        return String.format("id: %d, name: %s", id, name);

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (isNull(o) || !(o instanceof User)) return false;
        var user = ((User)o);
        return this.id == user.getId() && Objects.equals(user.getName(), this.name);
    }

    @Override
    public int hashCode() {
        return hash(this.id, this.name);
    }


    @Override
    public int compareTo(User o) {
        return Integer.compare(this.id, o.id);
    }

}
