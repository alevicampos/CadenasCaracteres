package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimos {

    public void numerosprimos() {
        Scanner entrada = new Scanner(System.in);

        // Pregunto al usuario hasta qué número quiere que le muestre los números primos
        System.out.println("¿Hasta qué número deseas que te muestre los números primos?");
        int m = entrada.nextInt();
//
//        // Generar un array con todos los números desde 2 hasta m
//        int[] numeros = new int[m - 1];
//        for (int i = 0; i < m - 1; i++) {
//            numeros[i] = i + 2;
//        }
//
//        System.out.println("Números generados: " + Arrays.toString(numeros));
//
//        // Array para almacenar los números primos
//        int[] primos = new int[numeros.length];
//        // Contador para la longitud del array de números primos
//        int contador = 0;
//        //Declaro un auxiliar para guardar los numero primos
//        int aux;
//
//        // Recorrer el array numeros para identificar los primos
//        for (int i = 0; i < numeros.length; i++) {
//            aux = numeros[i];
//            boolean esPrimo = true;
//
//            // Determinar si el número es primo
//            for (int j = 2; j <= Math.sqrt(aux); j++) {
//                if (aux % j == 0) {
//                    esPrimo = false;
//                    break;
//                }
//            }
//
//            // Si es primo, agregarlo al array primos
//            if (esPrimo) {
//                primos[contador] = aux;
//                contador++;
//            }
//        }
//
//        // Mostrar los números primos encontrados
//        System.out.println("Números primos:");
//        for (int i = 0; i < contador; i++) {
//            System.out.print(primos[i] + " ");
//        }

        //otra opcion
        antonio:
        for (int i = 2; i<=m ; i++){

            for(int j= i-1; j>=2; j--) {

                if(i%j==0){
                    continue antonio;
                }
            }
            System.out.println(i+" ");
        }

    }
}



