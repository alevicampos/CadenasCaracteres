package org.example;

import java.util.Random;

public class EjercicioArrays1 {
    public void ejercicioArrays1(){
        Random random = new Random();
        int[] numeros = new int[8];
        int suma=0;
        for (int i = 0; i<numeros.length; i++){
        numeros[i]= random.nextInt(501);
        suma+=numeros[i];

        }
        System.out.println("la suma de los elementos es  = " + suma);
    }
}
