package org.example;

import java.util.Scanner;

public class EjercicioArrays4 {
    public void ejercicioArrays4(){
        int numeros[] = {1,3,5,7,9};
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un índice del 0 al 4");
        int indice = entrada.nextInt();

        for (int i = 0; i<numeros.length;i++){
            if (i!= indice) {
                System.out.print("Array resultante: " + numeros[i]+ ", ");
            }
            }
        }
    }

