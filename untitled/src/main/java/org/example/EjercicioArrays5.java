package org.example;

public class EjercicioArrays5 {
    public void ejercicioArrays5(){

        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = numeros.length - 1; i > 0; i--) {
            numeros[i] = numeros[i - 1];
        }

        int ultimoIndice = numeros.length;
        numeros[0] = ultimoIndice;

        System.out.print("Array rotado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+",");

        }
    }
}
