import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 22), new User("John", 23), new User("Sam", 24),  new User("Jane", 25));


        printStringValue(User::name, users);
        printStringValue(user -> String.valueOf(user.age()), users);

        printStringValue(Record::toString, users);


        users.forEach(System.out::println);

        users.forEach(user -> System.out.println(user));

        users.forEach((User user) -> {
            System.out.println(user);
        });

        /*
        interface funcional é a base para criação de lambda
         */

        var consumer = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user);

            }



        };
        users.forEach(consumer);
    }
    /*
    A classe List é uma interface
    List.of retorna uma coleção imutável de itens
    Interfaces tem que ser implementadas

     */

    private static void printStringValue(Function<User, String> callback, List<User> users) {
        System.out.println(callback.apply(new User("Maria", 22)));

        users.forEach(u -> System.out.println(callback.apply(u)));

    }

}