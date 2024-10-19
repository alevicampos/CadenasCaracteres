package org.example;

import java.util.Scanner;

public class Bucles8 {
    public void bucles8(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = entrada.next();
        String letra;

        for (int i= palabra.length(); i> 0 ; i --){
            letra = palabra.substring(i-1,i);
            System.out.print(letra);

        }
    }
}