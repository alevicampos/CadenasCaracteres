package org.example;

import java.util.Arrays;

public class EliminarDuplicados {
    public void eliminarduplicados(){

        int [] original = {1,1,6,7,8,8,10,15,15};

        int [] auxiliar= new int[original.length];

        int [] limpio;

        for (int i = 0; i < original.length; i++ ){

            //mi original [i} Vs original (i+1)
            if (i!=original.length-1 && original[i] == original[i+1]) {
                System.out.println("Duplicado = " + i);
            }else{
                auxiliar[i] = original[i];
            }
            System.out.println(Arrays.toString(auxiliar));
        }
    }
}
