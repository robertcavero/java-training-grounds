import domain.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        for (Integer i = 0; i <100; i++){
            Integer i = 1;
            i++;

            Integer in = new Integer(1);
            var pi = in.intValue();
            pi++;
            pi = new Integer(pi);

            int a = 1;



        }
        */

        /*
        int[] arr = new int[]();
        int i = null; //primitivo não aceita null
        List<int> list = new ArrayList<>();
        //não aceita tipo primitivo
        //tem que usar wrapper (ex. Integer)
        */


        /*
        boolean b;
        byte by;
        short s;
        char c;
        int o;
        float f;
        long l;
        double d;

        o = 0;
        printValue(o);
        System.out.println(o);
        */

        /*
        o vale 0.
        Você chama printValue(o).
        O método recebe uma cópia do valor de o
        Dentro do método, ++o incrementa a cópia, então imprime 1.
        Quando o método termina, essa cópia deixa de existir.
        O o original no main continua valendo 0.
        */



        var user = new User("Joao", 20);
        System.out.println(user);
        printValue(user);
        System.out.println(user);





    }

    /*
    private static void printValue(int o) {
        System.out.println(++o);
    }
    */

    private static void printValue(User user) {
//        System.out.println(++o);
        /*
        user = new User("Bob", 31);
        System.out.println(user);
        */

        /*
        final impede que a referência `user` seja alterada para outro objeto.
        Porém, o objeto ainda pode ser modificado:
        user.setName(...) e user.setAge(...) continuam funcionando.
        */

        user.setName("Maria");
        user.setAge(23);
        System.out.println(user);

    }



}