import domain.SexEnum;
import domain.User;
import domain.UserV2;

import java.util.Optional;

import static domain.SexEnum.FEMALE;
import static domain.SexEnum.MALE;

public class Main {
    public static void main(String[] args) {
        Optional<User> optional = Optional.of(new User("Joao", 18, MALE));
        // Optional<User> optional = Optional.empty();

        /*final int newAge = 22;

        optional.ifPresentOrElse(
                user -> {
                    System.out.printf("Usuario: %s \n", user);
                    user = new User("Joaquim", newAge, MALE);
                    System.out.printf("Usuario: %s \n", user);
                },
                () -> System.out.println("Usuario nao foi informado")

        );*/


        /*System.out.println(optional.orElse(new User("Maria", 34, FEMALE)));

        System.out.println(optional.orElse(defaultUser()));

        System.out.println(optional.orElseGet(Main::defaultUser));*/



        Optional<UserV2> newUser = optional.map(user -> new UserV2(user.name(), user.age(), user.sex()));
        System.out.println(newUser.orElseThrow());

    }


    private static User defaultUser() {
        System.out.println("Buscando valor default");
        return new User("Maria", 34, FEMALE);
    }



}