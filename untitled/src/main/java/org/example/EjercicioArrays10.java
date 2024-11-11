package org.example;

import java.util.Scanner;

public class EjercicioArrays10 {
    public void ejercicioArrays10() {
        String palabras[] = {"Amparo", "Alejandra", "Patricia"};
        Scanner entrada = new Scanner(System.in);
        String letra;
        char letraChar = ' ';

        while (true) {
            System.out.println("Introduce una letra: ");
            letra = entrada.next().toUpperCase();

            // Verificar que el valor introducido sea sólo una letra
            // No sé como controlar que me introduzca un número y no una letra
            if (letra.length() == 1) {
                letraChar = letra.charAt(0);
                break; // Salimos del bucle si la entrada es buena
            } else {
                System.out.println("Entrada no válida. Debes introducir una sola letra.");
            }
        }

        System.out.print("Las palabras que empiezan por " + letraChar + " son: ");
        for (String palabra : palabras) {
            if (palabra.charAt(0) == letraChar) {
                System.out.print(palabra + ", ");
            }
        }
    }
}

