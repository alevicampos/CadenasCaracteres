package org.example;

import java.util.Arrays;

public class MetodoSort {
    public void metodosort(){
        int [] numeros = {4,3,10,34,21};
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(numeros);

        System.out.println(Arrays.toString(numeros));

        int num = -34;
        int posicion = Arrays.binarySearch(numeros, num);

        System.out.println("posicion = " + posicion);


    }
}
