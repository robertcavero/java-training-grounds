import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        var user = new User(1, "Jao");

        users.add(user);
        users.add(new User(2, "Maria"));
        users.add(new User(3, "Juan"));
        System.out.println(users.contains(user));
        System.out.println(users.contains(new User(1, "Jao")));
        System.out.println(new User(1, "Juan").equals(new User(1, "Juan"))); //endereço de memória
        System.out.println(new User(1, "Jorge"));

        users.add(new User(1, "Leo"));

        System.out.println(users);
        System.out.println(users.remove(new User(0, "Leo")));
        System.out.println(users.remove(0));


        List<Integer> arrayList = new ArrayList<>();
        var arrayStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }
        System.out.println(Duration.between(arrayStart, OffsetDateTime.now()).toMillis());



        List<Integer> vector = new Vector<>();
        var vectorStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            vector.add(i);
        }
        System.out.println(Duration.between(vectorStart, OffsetDateTime.now()).toMillis());


        List<Integer> linkedList = new LinkedList<>();
        var linkedStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            linkedList.add(i);
        }
        System.out.println(Duration.between(linkedStart, OffsetDateTime.now()).toMillis());







    }
}