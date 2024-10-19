package org.example;

import java.util.Scanner;

public class Bucles7 {
    public void bucles7(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = entrada.nextInt();
        int factorial= 1;

        for (int i = 1; i <= numero ; i++ ){
            factorial *= i;

        }
        System.out.println("El factorial de "+numero+ " es: " +factorial);
    }
}

