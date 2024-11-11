package org.example;

import java.util.Arrays;

public class EjercicioArrays5 {
    public void ejercicioArrays5(){

        int[] numeros = {1, 2, 3, 4, 5};
        int[] numerosClonado = numeros.clone();
        int[] rotado = new int[numerosClonado.length];

        rotado [0] = numerosClonado[numerosClonado.length-1];
        System.arraycopy(numerosClonado,0,rotado,1, numerosClonado.length-1);
        System.out.println("Array Original: " + Arrays.toString(numeros));
        System.out.println("Array Rotado: " + Arrays.toString(rotado));

    }
}
