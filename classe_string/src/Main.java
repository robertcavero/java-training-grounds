import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var value = "java;java;java;java";
//        value = value.replace("j", "J");
        /*
        var values = value.split(";", 2);
        System.out.println(values);

        for (var v : values) {
            System.out.println(v);
            */


//        System.out.println(value.contains("+"));

//        System.out.println(value.indexOf("a", 1, 5));

        /*var value3 = "        ";
        var value4 = "    f   ";

        System.out.println(value.startsWith("ja"));
        System.out.println(value.endsWith("va"));

        System.out.println(value3.isEmpty());
        System.out.println(value3.isBlank());

        System.out.println(value4.trim());

        var value5 = "/========java=======/";

        System.out.println(value5.substring(9, 12));*/

        var value6 = """
                {"name": "Joao","age": 10}""";

        Map<String, String> map = new HashMap<>();

        value6 = value6.replace("{", "").replace("}", "").replace("\"", "");

        var valueArr = value6.split(",");
        for(var v : valueArr) {
            var keyValue = v.split(":");
            map.put(keyValue[0], keyValue[1]);

        }


        System.out.println(map);


        /*while(map.size() != 2) {
            var startKeyIndex = value6.indexOf("\"");
            var endKeyIndex = value6.indexOf("\":");
            var keyValue = value6.substring(startKeyIndex + 1, endKeyIndex);

            var startValueIndex = value6.indexOf(":\"");
            var endValueIndex = value6.indexOf("\":", startValueIndex);
            var valuekey = value6.substring(startValueIndex + 1, endValueIndex);
            map.put(keyValue, valuekey);

        }
        System.out.println(map);*/






        }
    }
