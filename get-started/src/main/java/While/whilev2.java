package main.java.While;

import java.util.Scanner;

public class whilev2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "exit";

        /* do while executa primeiro e depois faz a verificação
        * então há garantia que no do while o codigo ira rodar
        * pelo menos uma vez, independente de atender a condição
        * ou não
        * */
        do {
            System.out.println("Informe um nome");
            name = scanner.nextLine();
            System.out.println(name);


        }while(!name.equalsIgnoreCase("exit"));

    }
}
