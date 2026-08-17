import domain.Contact;
import domain.ContactType;
import domain.User;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static domain.ContactType.EMAIL;
import static domain.ContactType.PHONE;
import static domain.Sex.FEMALE;
import static domain.Sex.MALE;

public class Main {
    public static void main(String[] args) {
        /*var users = new ArrayList<User>(generateUsers());
        //users.sort((v1,v2) -> v1.name().compareTo(v2.name()));
        //users.sort(Comparator.comparing(User::name, Comparator.reverseOrder()));

        var values = users.stream()
                        .filter(u-> u.contacts().size() >= 2)
                                .toList();

        //users.forEach(System.out::println);
        values.forEach(System.out::println);*/


        List<User> users = new ArrayList<>(generateUsers());
        /*users.sort(Comparator.comparing(User::name));
        users.forEach(System.out::println);*/

        /*var values = users.stream()
                .filter(u -> u.contacts() != null && u.contacts().isEmpty())
                .toList();
        values.forEach(System.out::println);*/

        var values = users.stream()
                .flatMap(u -> u.contacts().stream())
                .filter(c -> c.type() == PHONE)
                .map(c -> c.description().replace("(",  "").replace(")", ""))
                .mapToLong(p -> Integer.parseInt(p))
                .average();

        System.out.println(values);


        var values2 = users.stream()
                .filter(u -> u.sex() == FEMALE)
                .collect(Collectors.toMap(User::name, user -> user));

        values2.forEach((key, value) -> System.out.printf("key: %s, value: %s\n", key, value));



    }

    private static List<User> generateUsers() {

        var contacts1 = List.of(
                new Contact("111111111", PHONE),
                new Contact("joao@gmail.com", EMAIL)

        );
        var contacts2 = List.of(
                new Contact("222222222", PHONE)

        );
        var contacts3 = List.of(
                new Contact("jose@gmail.com", EMAIL)

        );
        var contacts4 = List.of(
                new Contact("steve123@gmail.com", EMAIL),
                new Contact("steve@gmail.com", EMAIL)

        );
        var contacts5 = List.of(
                new Contact("555555555", PHONE),
                new Contact("666666666", PHONE)

        );


        var user1 = new User("Joao", 26, MALE, new ArrayList<>(contacts1));
        var user2 = new User("Maria", 51, FEMALE, new ArrayList<>(contacts2));
        var user3 = new User("Jose", 34, MALE, new ArrayList<>(contacts3));
        var user4 = new User("Steve", 67, MALE, new ArrayList<>(contacts4));
        var user5 = new User("Bob", 43, MALE, new ArrayList<>(contacts5));
        var user6 = new User("Ulisses", 33, MALE, new ArrayList<>());



        return List.of(user1, user2, user3, user4, user5, user6);
    }
}