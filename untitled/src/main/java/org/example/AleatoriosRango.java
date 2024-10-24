package org.example;

import java.util.Random;
import java.util.Scanner;

public class AleatoriosRango {
    public void aleatoriosrango(){

        int aleatorio = 0;
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Introduce un valor de inicio para el rango: ");
        int minimo = entrada.nextInt();
        System.out.println("introduce un valor final para el rango: ");
        int maximo = entrada.nextInt();

        if (minimo < maximo){
            System.out.println("¿Cuántos números aleatorios quieres? ");
            aleatorio = entrada.nextInt();
        }else{
            System.out.println("El primer número es mayor o igual al segundo");
        }

        for (int i = 1; i<= aleatorio; i++ ){
            int numero = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.print(numero + ", ");
        }
    }
}
