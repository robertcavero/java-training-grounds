import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();
        users.add(new User(1, "Jao"));
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Bob"));
        users.add(new User(4, "Steve"));
        users.add(new User(5, "John"));
        users.add(new User(5, "John")); //Set não permite duplicidades

        System.out.println(new User(1, "Jao").equals(new User(1, "Jao")));

        System.out.println(users.contains(new User(1, "Jao")));


        System.out.println( new User(12, "Jao").hashCode());
        System.out.println( new User(21, "Bob").hashCode());


        users.forEach(System.out::println);

        var iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        users.removeAll(Arrays.asList( new User(1, "Jao"), new User(32, "Lip")));

        users.removeIf(user -> user.getId() == 4);


        System.out.println(users);

        Set<User> users2 = new LinkedHashSet<>();
        users2.add(new User(1, "Xin"));
        users2.add(new User(2, "Pao"));
        users2.add(new User(3, "King"));
        users2.add(new User(5, "Khan"));
        users2.add(new User(5, "Khan"));
        users2.add(new User(4, "Liu"));
        System.out.println(users2);


        Set<User> users3 = new TreeSet<>();
        users3.add(new User(1, "a"));
        users3.add(new User(2, "b"));
        users3.add(new User(3, "c"));
        users3.add(new User(5, "e"));
        users3.add(new User(5, "e"));
        users3.add(new User(4, "d"));
        System.out.println(users3);


    }


}
