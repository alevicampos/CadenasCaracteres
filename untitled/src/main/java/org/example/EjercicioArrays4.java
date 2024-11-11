package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrays4 {
    public void ejercicioArrays4() {
        int numeros[] = {1, 3, 5, 7, 9};
        int numerosResultante[] = new int[numeros.length - 1];
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int indiceOriginal = 0;
        int indiceResultante = 0;

        System.out.println("Array original: " + Arrays.toString(numeros));
        while (error) {
            try {
                System.out.print("Introduce un índice que quieres eliminar del 0 al 4: ");
                indiceOriginal = entrada.nextInt();
                // Verificamos que el índice esté dentro del rango deseado
                if (indiceOriginal >= 0 && indiceOriginal <= 4) {
                    error = false;
                } else {
                    System.out.println("El índice debe estar entre 0 y 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir números.");
                entrada.next(); // Limpiamos la entrada para evitar el bucle infinito
            }
        }

        // Eliminamos el elemento en el índice indicado y formamos el nuevo array
        for (int i = 0; i < numeros.length; i++) {
            if (i != indiceOriginal) {
                numerosResultante[indiceResultante] = numeros[i];
                indiceResultante++;
            }
        }

        System.out.println("Array resultante: " + Arrays.toString(numerosResultante));
    }
}

