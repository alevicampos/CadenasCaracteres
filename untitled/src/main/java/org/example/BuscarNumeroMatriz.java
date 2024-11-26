package org.example;

import java.util.Random;
import java.util.Scanner;

public class BuscarNumeroMatriz {
    public void buscarnumeromatriz(){

                int [][] matriz = new int[3][3];
                Scanner entrada = new Scanner(System.in);
                boolean error = true;


                System.out.println("Introduce los valores de la matriz");
                for (int fila = 0; fila< matriz.length; fila++){
                    for(int columna = 0; columna<matriz[fila].length; columna++) {
                        System.out.println("Introduce el valor de la posición [" +fila+ "]["+columna+"]");
                    matriz[fila][columna] = entrada.nextInt();

                    }
                }
                System.out.println("Matriz: ");

                for (int[] fila : matriz) {
                    for (int valor : fila) {
                        System.out.print(valor + " ");
                    }
                    System.out.println();
                }
                int numero = 0;
                while (error) {
                    System.out.println("Introduzca el numero a buscar: ");

                    try {
                        numero = entrada.nextInt();
                        error = false;
                    } catch (Exception e) {
                        System.out.println("Debes introducir un numero");
                        entrada.nextLine();
                    }
                }
                // Localizar si está el número y si está en qué posición.

                for (int fila = 0; fila< matriz.length; fila++){
                    for(int columna = 0; columna<matriz[fila].length; columna++) {
                        if (matriz[fila][columna] == numero) {
                            System.out.println("El número" +numero+ "se encuentra en la posición (" + fila + ", " + columna+")");

                        }

                    }
                }

            }
        }

