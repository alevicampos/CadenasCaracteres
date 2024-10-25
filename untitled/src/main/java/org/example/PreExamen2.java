package org.example;

import java.util.Scanner;

public class PreExamen2 {
    public void preexamen2(){
        Scanner entrada = new Scanner(System.in);
        int resultado=1;

        System.out.println("Introduce el valor de la base (positivo o negativo):");
        int base= entrada.nextInt();
        System.out.println("Introduce el valor del exponente (positivo)");
        int exponente = entrada.nextInt();

        for (int i= 0; i<exponente;i++){
            resultado *= base;

        }
        System.out.println("resultado = " + resultado);

    }
}
