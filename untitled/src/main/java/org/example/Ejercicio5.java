package org.example;

import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner entrada = new Scanner(System.in);
        String texto;
        String palabra;
        int intento = 9;
        System.out.println("*** EJERCICIO 5 ****");
        System.out.println("JUGADOR 1: Introduce el texto: ");
        texto = entrada.nextLine();
        System.out.println("JUGADOR 2: Introduce una palabra: ");
        palabra = entrada.nextLine();
        boolean contienePalabra = false;

        while (intento != 0 && !contienePalabra) {

            if (texto.contains(palabra)) {
                System.out.println("ENHORABUENA! HAS ACERTADO LA PALABRA!");
                contienePalabra=true;
            } else {
                System.out.println("Introduce otra palabra:");
                palabra = entrada.nextLine();
                intento--;
                System.out.println("Te quedan " +intento+ " intentos");
            }

            }
        if(intento == 0){
            System.out.println("LO SIENTO!! HAS PERDIDO!!");
        }
        }
    public void ejercicio6(){

    }
    }

