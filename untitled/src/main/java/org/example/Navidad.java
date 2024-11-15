package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Navidad {
    public void navidad(){

        // Declaro el string de Navidad
        String navidad = "NAVIDAD";

        // Haciendo uso del metodo split() separo los lo caracteres en un array.
        String [] subNavidad = navidad.split("");

        // Lo imprimo para comprobar que se ha hecho
        System.out.println(Arrays.toString(subNavidad));

        // Como le tengo que pedir datos al usario llamo a la clase scanner
        Scanner entrada = new Scanner(System.in);

        // Solicito al usuario cuantas veces desea que se repita cada letra.
        System.out.println("¿Cuantas veces quieres repetir la letra ");
        String numero = entrada.next();

        // Separo con el metodo split el String en un array
        String [] numeros = numero.split("");

        // Compruebo que el split se ha realizado correctamente
        System.out.println(Arrays.toString(numeros));

        // Imprimo el resultado
        String resultado = "";
        for (int i = 0 ; i < subNavidad.length ; i++){
            for(int j = 0 ; j < Integer.parseInt(numeros[i]) ; j++){
                resultado = resultado + subNavidad[i];
            }
        }
        System.out.println(resultado);

    }
}
