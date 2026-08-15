package keyword;

public class Client1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String nestedName;

    public class Nested{
        public void test(){
            name = "";
            System.out.println(name);
        }


        public static class Nested2{
            public void test(){
                nestedName = "";
            }

        }
    }


}
