package org.example;

import java.util.Scanner;

public class Ejercicio7 {
    public void ejercicio7(){
        Scanner entrada = new Scanner(System.in);
        int altura;
        System.out.println("Introduce tu altura en centímetros:");
        altura = entrada.nextInt();

        if (altura <= 150) {
            System.out.println("Persona de altura baja");

        } else if (151<=altura && altura <=175) {
            System.out.println("Persona de altura media");

        }else if (altura > 176){
            System.out.println("Persona alta");
        }else{
            System.out.println(" el valor introducido no es correcto");
        }



    }
}
