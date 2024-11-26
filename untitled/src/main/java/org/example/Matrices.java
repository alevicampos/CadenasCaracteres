package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {
    public void matrices() {
//        int [][] matriz = new int[3][3];
//
//        for (int i = 0; i < matriz.length; i++){
//            for (int j= 0; j < matriz[i].length; j++) {
//
//                System.out.print(matriz[i][j]+"");
//            }
//            System.out.print("\n");
//        }
//        int [][] matriz2 = {{2,3,4,1},{5,10,12,6}};
//
//        for(int[] fila: matriz2){
//
//            System.out.println(Arrays.toString(fila));
//        }
//        Scanner entrada = new Scanner(System.in);
//
//        int [][]matriz3 = new int [3][3];
//
//        for (int i = 0; i < matriz3.length; i++) {
//            for (int j = 0; j < matriz3[i].length; j++) {
//                System.out.println("Introduce la posicion (" + i + "," + j + ")");
//                matriz3[i][j] = entrada.nextInt();
//            }
//        }
//
//            for (int i = 0; i < matriz3.length; i++){
//                for (int j= 0; j < matriz[i].length; j++) {
//
//                    System.out.print(matriz[i][j]+"");
//                }
//                System.out.print("\n");
//            }
        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] == 1) {
                    System.out.println("X ");
                } else {
                    System.out.println(". ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length-1; j >= 0; j--) {
                if (m[i][j] == 1) {
                    System.out.println("X ");
                } else {
                    System.out.println(". ");
                }
            }
            System.out.println(" ");
        }
    }

}