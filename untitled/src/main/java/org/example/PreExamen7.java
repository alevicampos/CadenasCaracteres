package org.example;

import java.util.Scanner;

public class PreExamen7 {
    public void preexamen7(){
        Scanner entrada = new Scanner(System.in);
        int numerosSecuencia = 0;

        while (true) {
            System.out.println("Introduzca un número positivo:");
            numerosSecuencia = entrada.nextInt();

            if (numerosSecuencia > 0) {
                break;
            } else {
                System.out.println("Error: El número debe ser mayor que cero. Inténtelo de nuevo.");
            }
        }

        int a = 0;
        int b = 1;
        int c;


        for (int i = 0; i < numerosSecuencia; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}