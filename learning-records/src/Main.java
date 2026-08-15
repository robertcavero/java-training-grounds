public class Main {
    public static void main(String[] args) {



        var person = new Person("Joao", 12);
        /*
            O construtor automático
            Quando você faz:

            var person = new Person("Joao", 12);

            o Java utiliza automaticamente o construtor:

            public Person(String name, int age)

            Mesmo que você não o tenha escrito.
         */











        System.out.println(person.getInfo());


        System.out.println(person.name());
        /*
            Métodos de acesso (getters)
            Observe este trecho:

            System.out.println(person.name());

            Muita gente estranha porque não existe:
            getName()

            Em records, o Java cria métodos com o mesmo nome do componente.
            Então:

            String name

            gera automaticamente:

            person.name()

            E

            int age

            gera:

            person.age()

            Não existem getters tradicionais.
         */




        var newPerson = new Person(person.name(), 13);
    }

}