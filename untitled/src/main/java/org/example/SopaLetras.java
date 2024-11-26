package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SopaLetras {
    public void sopaletras() {
        System.out.println("""
                ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈୨♡୧┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒
                 BIENVENIDO A LA SOPA DE LETRAS
                ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈୨♡୧┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚
                """);

        Scanner entrada = new Scanner(System.in);

        int filas = 0;
        int columnas = 0;

        while (true) {
            try {
                System.out.print("Introduce el número de filas: ");
                filas = entrada.nextInt();

                System.out.print("Introduce el número de columnas: ");
                columnas = entrada.nextInt();

                // Verifico si se introducen números son válidos (positivos)

                if (filas > 0 && columnas > 0) {
                    break; // Salir del bucle si todo está correcto
                } else {
                    System.out.println("El número de filas y columnas debe ser mayor que cero.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número válido.");
                entrada.nextLine();
            }
        }

        // Declaro la matriz

        String[][] matriz = new String[filas][columnas];

        // Solicito al usuario que introduzca los valores para cada fila

        for (int i = 0; i < filas; i++) {
            System.out.println("Introduce las letras de la fila " + (i + 1) + " (deben ser " + columnas + " letras):");
            String fila = entrada.next();

            // Verifico que el usuario ha introducido exactamente la cantidad de caracteres y en el formato adecuado

            if (fila.length() != columnas || !fila.matches("[a-zA-Z]+")) {
                System.out.println("ERROR. Introduce datos válidos: " + columnas + " letras mayúsculas o minúsculas.");
                return;
            }


            // Asigno las filas a la matriz

            String[] vectorFilas = fila.split("");

            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = vectorFilas[j];
            }
        }


        // Imprimo la sopa de letras para verificar que se generó correctamente

        System.out.println("La sopa de letras es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Solicito al usuario la palabra a buscar

        System.out.println("Introduce la palabra a buscar: ");
        String palabra = entrada.next();

        // Valido que la palabra contiene solo letras


        if (!palabra.matches("[a-zA-Z]+")) {
            System.out.println("ERROR. Introduce una palabra válida (solo letras).");
            return;
        }

        boolean encontrada = false;

// Busco la palabra en todas las direcciones posibles

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                // Busco horizontalmente hacia la derecha

                if (j + palabra.length() <= columnas) {
                    boolean coincide = true;
                    for (int k = 0; k < palabra.length(); k++) {
                        if (!matriz[i][j + k].equalsIgnoreCase(String.valueOf(palabra.charAt(k)))) {
                            coincide = false;
                            break;
                        }
                    }
                    if (coincide) {
                        System.out.println("Encontrada!!! En la posición horizontal [" + i + "][" + j + "]");
                        encontrada = true;
                    }
                }else{
                    encontrada = false;

                }

                // Busco verticalmente hacia abajo

                if (i + palabra.length() <= filas) {
                    boolean coincide = true;
                    for (int k = 0; k < palabra.length(); k++) {
                        if (!matriz[i + k][j].equalsIgnoreCase(String.valueOf(palabra.charAt(k)))) {
                            coincide = false;
                            break;
                        }
                    }
                    if (coincide) {
                        System.out.println("Encontrada!!! En la posición vertical [" + i + "][" + j + "]");
                        encontrada = true;
                    }
                }else{
                    encontrada = false;

                }
            }
        }

// Si la palabra no fue encontrada...

        if (!encontrada) {
            System.out.println("La palabra '" + palabra + "' no se encontró en la sopa de letras.");
        }

    }
}







