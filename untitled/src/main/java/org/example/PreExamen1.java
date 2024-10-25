package org.example;

import java.util.Scanner;

public class PreExamen1 {
    public void preexamen1(){

        Scanner entrada = new Scanner(System.in);
        int cantidadMayor = 0;
        int cantidadMenor = 0;
        int cantidadIgual = 0;
        System.out.println("¿Cuantos números deseas introducir?");
        int cantidad = entrada.nextInt();

        for (int i = 0; i<cantidad; i++){
            System.out.println("Introduce el número "+i+ ":");
            int numero = entrada.nextInt();
            if (numero >0){
                cantidadMayor++;
            } else if (numero<0) {
                cantidadMenor++;
            }else{
                cantidadIgual++;
            }
        }
        System.out.println("De los números introducidos hay: ");
        System.out.println("\tMayores que 0 = " + cantidadMayor);
        System.out.println("\tMenores que 0 = " + cantidadMenor);
        System.out.println("\tIguales a 0 = " + cantidadIgual);
    }
}
