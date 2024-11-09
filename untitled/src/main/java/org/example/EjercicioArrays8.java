package org.example;

import java.util.Arrays;

public class EjercicioArrays8 {
    public void ejercicioArrays8(){
        int [] arrayOriginal = {1,2,3,5};
        int [] arrayResultante = new int[5];

        //Añado los valores del arrayOriginal al arrayResultante

        System.arraycopy(arrayOriginal,0,arrayResultante,0,3);

        //Inserto los valores que me faltan

        arrayResultante[3] = 4;
        arrayResultante[4] = 5;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayResultante));

    }
}
