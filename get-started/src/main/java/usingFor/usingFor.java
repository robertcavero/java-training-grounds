package main.java.usingFor;

import java.util.Scanner;

public class usingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * O laço `for` em Java possui a seguinte estrutura:
         *
         *     for (inicialização; condição; atualização) {
         *         // corpo
         *     }
         *
         * Neste caso, as três partes foram deixadas vazias:
         *
         *     for (;;) {
         *         ...
         *     }
         *
         * Isso significa:
         * - Inicialização: vazia
         * - Condição: vazia
         * - Atualização: vazia
         *
         * Quando a condição é omitida, o Java a considera como `true`.
         * Portanto, este código é equivalente a:
         *
         *     for (; true; ) { ... }
         *
         * e também a:
         *
         *     while (true) { ... }
         *
         * Assim, o laço é executado indefinidamente até que um `break` seja encontrado.
         *
         * Fluxo de execução:
         * 1. Solicita que o usuário digite um nome.
         * 2. Lê o nome informado.
         * 3. Se o nome for "exit" (ignorando maiúsculas e minúsculas),
         *    executa `break` e encerra o laço.
         * 4. Caso contrário, imprime o nome e inicia uma nova iteração.
         */


        for(;;){
        System.out.println("Digite um nome:");
        var name = scanner.next();

        //ao trabalhar com string não podemos usar ==.
        if(name.equalsIgnoreCase("exit")) break;


        System.out.println(name);
        }
    }
}
