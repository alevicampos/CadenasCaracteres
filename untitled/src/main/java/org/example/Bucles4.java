package org.example;

import java.util.Scanner;

public class Bucles4 {
    public void bucles4(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = entrada.next();
        String letra;

        for (int i= 0; i< palabra.length() ; i ++){
            letra = palabra.substring(i,i+1);
            System.out.println(letra);

        }
    }
}
