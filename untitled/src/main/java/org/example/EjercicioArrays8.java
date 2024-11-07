package org.example;

import java.util.Arrays;

public class EjercicioArrays8 {
    public void ejercicioArrays8(){
        int [] arrayOriginal = {1,2,3,5};
        //Para no modificar el array original lo clono
        int [] arrayClonado = arrayOriginal.clone();

        //Modifico el valor en el array clonado
        arrayClonado[3] = 4;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClonado));

    }
}
