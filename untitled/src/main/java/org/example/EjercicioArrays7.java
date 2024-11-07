package org.example;

import java.util.Arrays;

public class EjercicioArrays7 {
    public void ejercicioArrays7(){
        int[] arrayUno = {1, 2, 3};
        int[] arrayDos = {4, 5, 6};

        int longitudArrayUno = arrayUno.length;
        int longitudArrayDos = arrayDos.length;
        int sumaLongitudes = longitudArrayUno + longitudArrayDos;
        int[] sumaArray = new int[sumaLongitudes];

        System.arraycopy(arrayUno, 0, sumaArray, 0, longitudArrayUno);

        System.arraycopy(arrayDos, 0, sumaArray, longitudArrayUno, longitudArrayDos);

        System.out.println("Array combinado: " + Arrays.toString(sumaArray));
    }
}


