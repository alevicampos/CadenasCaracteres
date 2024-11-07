package org.example;

import java.util.Scanner;

public class EjercicioArrays6 {
    public void ejercicioArrays6() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los números del array");
        int numeros[]= new int[5];

        for(int i=0; i<numeros.length; i++) {

            numeros[i] = entrada.nextInt();
        }
        boolean esSimetrico = true;

        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esSimetrico = false;
                break;
            }
        }

        if (esSimetrico) {
            System.out.println("El array es simétrico: SI");
        } else {
            System.out.println("El array es simétrico: NO");
        }
    }
}



