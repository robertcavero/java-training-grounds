import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*var value1 = Stream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray(Integer[]::new)

                ;


        for (var v: value1) {
            System.out.println(v);
        }

        System.out.println("=====================");

        var value2 = IntStream.generate(() -> new Random().nextInt())
                .limit(5)
                .toArray();


        for (var v: value2) {
            System.out.println(v);
        }*/

        // List<String> debugValues = new ArrayList<>();
        var value = Stream.of("Maria", "Joao", "Luana", "Bob", "Steve")
                .reduce("", (a, b) -> a + ";"+ b)
                .replaceFirst(";", "")
                ;
                /*.filter(s -> s.startsWith("M"))
                .anyMatch(s -> s.contains("a"));*/
                /*//.filter(name -> name.endsWith("a"))
                //.peek(System.out::println)
                //.peek(debugValues::add)
                .filter(name -> name.endsWith("a"))
                .limit(2)
                .toList();*/



        // System.out.println(debugValues);
        System.out.println(value);


        var value2 = Stream.of(1,2,3,4,5,6,7,8,9,10)
                //.reduce(0 , Integer::sum);
                //.average();
                //.distinct().collect(Collectors.toList());
                        .map(n -> n % 2 == 0)
                                .toList();


        System.out.println(value2);



        List<Integer> values4 = List.of(3,6,9, 12);
        List<Integer> values5 = List.of(1,2,3,4,5,6,7,8,9,10,11,12);

        var newValues = values5.stream()
                .parallel()
                .filter(values4::contains)
                .peek(n -> System.out.printf("filter %s \n", n))
                .map(n -> values4.stream().reduce(n,(n1, n2) -> n1 - n2))
                .peek(n -> System.out.printf("map %s \n", n))
                .collect(Collectors.toSet());

        System.out.println(newValues);
    }
}
