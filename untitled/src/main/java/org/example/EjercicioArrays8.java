package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays8 {
    public void ejercicioArrays8(){
        Scanner entrada = new Scanner(System.in);
        int[] arrayOriginal = {1, 2, 3, 5};
        int posicion = 0;
        boolean error = true;
        int numero = 0;
        boolean errorDos = true;

        // Solicitar y validar la posición
        while (error) {
            System.out.println("¿En qué posición deseas introducir un número?");
            try {
                posicion = entrada.nextInt();
                if (posicion >= 0 && posicion <= arrayOriginal.length) {
                    error = false;
                } else {
                    System.out.println("La posición está fuera de rango. Debe estar entre 0 y " + arrayOriginal.length);
                }
            } catch (Exception e) {
                System.out.println("Debes introducir un número válido.");
                entrada.nextLine(); // Limpiar el buffer
            }
        }

        // Solicitar y validar el número
        while (errorDos) {
            System.out.println("¿Qué número deseas introducir?");
            try {
                numero = entrada.nextInt();
                errorDos = false;
            } catch (Exception e) {
                System.out.println("Debes introducir un número válido.");
                entrada.nextLine(); // Limpiar el buffer
            }
        }

        // Crear un nuevo array con espacio adicional
        int[] resultante = new int[arrayOriginal.length + 1];

        // Copiar elementos antes de la posición
        System.arraycopy(arrayOriginal, 0, resultante, 0, posicion);

        // Insertar el nuevo número
        resultante[posicion] = numero;

        // Copiar los elementos restantes después de la posición
        System.arraycopy(arrayOriginal, posicion, resultante, posicion + 1, arrayOriginal.length - posicion);

        // Imprimir el array resultante
        System.out.println("Array resultante: " + Arrays.toString(resultante));
    }
}
