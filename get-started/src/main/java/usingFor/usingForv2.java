package main.java.usingFor;

import java.util.Scanner;

public class usingForv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //this will log all uneven numbers
        for(var i = 0; i <= 100; i++){
            if(i % 2 == 0){
                continue;
            }

            System.out.println(i);
        }
    }
}
