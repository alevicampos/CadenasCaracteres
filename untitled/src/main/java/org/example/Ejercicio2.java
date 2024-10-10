package org.example;

import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** EJERCICIO 2 ****");

        System.out.println("Introduce la primera palabra:");
        String palabra1= entrada.next();
        System.out.println("Introduce la segunda palabra:");
        String palabra2= entrada.next();

        int longitudPalabra1= palabra1.length();
        int longitudPalabra2= palabra2.length();

        if (longitudPalabra1 == longitudPalabra2){
            System.out.println("Las palabras introducidas miden lo mismo");

        } else if (longitudPalabra1 > longitudPalabra2) {
            System.out.println(palabra1+ " es más larga que " +palabra2);

        }else{
            System.out.println(palabra2+ " es más larga que " +palabra1);
        }
    }
}
