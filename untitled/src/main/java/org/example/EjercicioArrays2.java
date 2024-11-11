package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioArrays2 {
    public void ejercicioArrays2(){
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int[] numeros = new int[5];

        while (error) {
            System.out.println("Introduce los números a invertir:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Número "+ (i+1) +": ");

                try {
                    numeros[i] = entrada.nextInt();
                    error = false;

                } catch (InputMismatchException e) {
                    System.out.println("Tienes que introducir un número.");
                    entrada.nextInt();

                }
            }
        }
//        for (int i = numeros.length-1;i>=0;i-- ){
//            System.out.println(numeros[i]+",");
//        }

//        int numeros[] ={1,2,3,4,5};

        int tamMitad = numeros.length/2;
        int aux;

        for (int i = 0; i<= tamMitad ; i++){
            aux = numeros[i];
            numeros[i]= numeros[numeros.length-1-i];
            numeros[numeros.length-1-i] =aux;

        }
                for (int i = 0; i<= numeros.length-1 ;i++ ){
            System.out.print(numeros[i]+",");
        }

    }
}
