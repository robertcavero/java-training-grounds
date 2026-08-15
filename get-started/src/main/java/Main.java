package main.java;

import main.java.Records.Person;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipado = scanner.next().equalsIgnoreCase("s");


        if (idade >= 18){
            System.out.printf("%s tem %s anos, você pode dirigir ", nome, idade);
        }else if (idade >= 16 && isEmancipado){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir \n", nome, idade);
        }else{
            System.out.printf("%s, você não pode dirigir \n", nome);
        }


        var canDrive = (idade >= 18 || (idade >= 16 && isEmancipado));

        var message = canDrive ? nome + ", você pode dirigir \n" : nome + ", você não pode dirigir \n";

        System.out.println(message);
        System.out.println("Fim da execução!");



    }


}
