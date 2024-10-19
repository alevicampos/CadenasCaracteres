package org.example;

import java.util.Scanner;

public class Bucles6 {
    public void bucles6(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado= 0;

        System.out.print("¿Cuántos números quieres sumar?:");
        int cantidad = entrada.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Inserta nº" + i + ":");
            numero = entrada.nextInt();
            resultado += numero;

        }
        System.out.println("\n El resultado es:" + resultado);
    }
}
