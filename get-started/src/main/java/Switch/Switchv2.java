package main.java.Switch;

import java.util.Scanner;
public class Switchv2 {
    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Informe um numero de 1 até 7");
        var option = Scanner.nextInt();
        //não precisa de break neste caso
        var message = switch (option) {
            //Sempre que você usa um bloco { ... } em um switch expression e precisa retornar um valor daquele bloco com yield.
            case 1, 7 -> {
                var day  = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana", day);
            }

            // se quiser apagar apenas System.out.println, use Alt + J e isso vai ajudar a selecionar ocorrencias
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            default -> "invalid";
        };


    }
}
