package org.example;

import java.util.Scanner;

public class Ejercicio3 {
    public void ejercicio3() {
        Scanner entrada = new Scanner(System.in);


        System.out.println("*** EJERCICIO 3 ****");
        
        System.out.println("Intoduce un número (6 cifras):");
        String N = entrada.next();
        System.out.println("Introduce el número de cifras que le quieres quitar: ");
        int m = entrada.nextInt();

        int longitudN = N.length();

        String nuevoNumero = N.substring(0,longitudN-m);
        System.out.println("El nuevo valor es = " + nuevoNumero);


    }
}