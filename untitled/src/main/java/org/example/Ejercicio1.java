package org.example;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class Ejercicio1 {
    public void ejercicio1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** EJERCICIO 1 ****");

        System.out.println("INTRODUCE UNA PALABRA O FRASE:");
        String frase = entrada.nextLine();
        
        System.out.println("Texto original: " + frase);

        System.out.println("La longitud del texto es: " + frase.length());

        System.out.println("Texto sin espacios: " + frase.replace(" ",""));
        
        int mitad = frase.length()/2;
        String mitad1 = frase.substring(0,mitad);
        String mitad2 = frase.substring(mitad,frase.length());
        System.out.println("Texto dividido en 2 mitades: Primera mitad del texto es \"" + mitad1+ "\" y la segunda mitad del texto es \""+mitad2+"\"." );
        System.out.println("Texto a mayúsculas: " +frase.toUpperCase());
    }
}