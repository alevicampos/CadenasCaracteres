package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays4 {
    public void ejercicioArrays4(){
        int numeros[] = {1,3,5,7,9};
        int numerosResultante[] = new int [numeros.length-1];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un índice del 0 al 4");
        int indice = entrada.nextInt();

        for (int i = 0; i<numeros.length;i++){
            if (i!= indice) {
                System.out.print("Array resultante: " + numeros[i]+ ", ");
            }
            }

        for(int i =0; i<numeros.length-1;i++){
            if(i < indice){
                numerosResultante[i]= numeros[i];

            }else {
                numerosResultante[i]= numeros[i+1];
            }
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosResultante));
        }
    }

