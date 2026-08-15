package main.java.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7");
        var option = Scanner.nextInt();
        switch (option) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Segunda");
                break;

            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção invalida");

        }
    }
}
