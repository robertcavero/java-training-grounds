package keyword;

/*
Classe Default
Não pode ser acessada fora do seu package
 */
public class Client {
    protected String name;
    protected int age;


    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}

