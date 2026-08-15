import domain.User;

import java.util.HashMap;
import java.util.Map;


public class Main{
    public static void main(String[] args){
        Map<String, User> users = new HashMap<>();
        users.put("jao.com", new User("Jao", 22));
        users.put("steve.com", new User("Steve", 17));
        users.put("bob.com", new User("Bob", 32));
        users.put("khan.com", new User("Khan", 65));
        System.out.println(users);
        System.out.println("=========================");

        users.keySet().forEach(System.out::println);
        System.out.println("=========================");
        users.values().forEach(System.out::println);
        System.out.println("=========================");
        System.out.println(users.containsKey("jao.com"));
        System.out.println(users.containsValue(new User("Jao", 22)));

        System.out.println("=========================");
        System.out.println(users.remove("steve.com"));
    }
}