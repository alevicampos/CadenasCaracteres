package org.example;

import java.util.Random;

public class SumaFilasColumnas {
    public void sumafilascolumnas(){

        Random random = new Random();

        int filas = random.nextInt(5)+1;
        int columnas = random.nextInt(5)+1;

        int [][] matriz = new int[filas][columnas];

        for (int fila = 0; fila< matriz.length; fila++){
            for(int columna = 0; columna<matriz[fila].length; columna++) {

                matriz[fila][columna] = random.nextInt(9)+1;

            }
        }
        System.out.println("Matriz: ");

        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        //Suma de las filas

        int suma = 0;
        System.out.println("Suma de filas: ");
        for (int fila = 0; fila< matriz.length; fila++){

            for (int columna = 0; columna<matriz[fila].length; columna++) {

                suma += matriz[fila][columna];

            }
                System.out.println("Fila" + (fila+1) + ": " + suma);
                suma=0;

        }
        System.out.println("Suma de columnas: ");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma+= matriz[j][i];

            }
            System.out.println("columna " + (i+1) + ": " + suma);
            suma=0;
        }

    }
}
