public record Person( String name, int age) {

    public Person{
        /*
        Construtor Compacto (Compact Constructor).
        Ele parece estranho no começo porque não possui parâmetros.
        Na verdade, os parâmetros já existem.
        public Person(String name, int age)
        Só que o Java os declara automaticamente.
        Você pode usar esse construtor para validar dados.
        public Person {

            if (age < 0) {
                throw new IllegalArgumentException("Idade inválida");
            }

            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Nome obrigatório");
            }
        }

        Depois dessas validações, o Java faz automaticamente:

        this.name = name;
        this.age = age;

        Você não precisa escrever essas atribuições.


        Uma vantagem interessante
        Como equals() e hashCode() já são implementados, dois records com os mesmos valores são considerados iguais:

        Person p1 = new Person("Joao", 12);
        Person p2 = new Person("Joao", 12);

        System.out.println(p1.equals(p2));

        Resultado:

        true

        Em uma classe comum, você precisaria implementar equals() manualmente para obter esse comportamento.





         */

    }

    public String getInfo(){
        return "Name: " + name + ", Age: " + age;
    }
    public Person (String name){
        this(name ,0);
    }
}
