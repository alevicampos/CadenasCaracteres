package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrays6 {
    public void ejercicioArrays6() {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean error;

        // Introducir los 5 números del array
        for (int i = 0; i < numeros.length; i++) {
            error = true; // Inicializo error en true
            while (error) {
                System.out.print("Introduce un número para la posición " + i + ": ");
                try {
                    numeros[i] = entrada.nextInt();
                    error = false;
                } catch (InputMismatchException e) {
                    System.out.println("Debes introducir un número válido.");
                    entrada.next(); // Limpiamos el búffer
                }
            }
        }

        // Compruebo la simetría
        boolean esSimetrico = true;
        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - 1 - i]) {
                esSimetrico = false;
                break;
            }
        }

        // Resultado de la simetría
        if (esSimetrico) {
            System.out.println("El array es simétrico: SI");
        } else {
            System.out.println("El array es simétrico: NO");
        }
    }
}



