package org.example;

import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {
        Scanner entrada = new Scanner(System.in);
        String texto;
        String subcadena;
        int contador=0;

        System.out.println("*** EJERCICIO 4 ****");
        System.out.println("Introduzca el texto:");
        texto = entrada.nextLine();
        System.out.println("Introduzca la palabra a buscar");
        subcadena = entrada.nextLine();

        int coincidencia1 = texto.indexOf(subcadena);
        contador++;
        if (coincidencia1 != -1) {
            int coincidencia2 = texto.indexOf(subcadena, coincidencia1);
            contador++;
            int coincidencia3 = texto.indexOf(subcadena, coincidencia2);
            contador++;
            System.out.println("La palabra " + subcadena + " aparece " + contador + " veces.");
        }else{
            System.out.println("No existen coincidencas.");
        }
    }
}
