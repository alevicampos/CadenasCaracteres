package org.example;

import java.util.Scanner;

public class Bucles2 {
    public void bucles2(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = entrada.nextInt();

        for (int i= numero; i>=1; i--){
            System.out.println(i);
        }
    }
}
