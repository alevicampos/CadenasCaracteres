package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjercicioArrays3 {
    public void ejercicioArrays3() {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[25];
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }
        System.out.println("Introduce un numero del 1 al 100");
        int numero = 0;
        try {
            numero = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Tienes que introducir un número");
            entrada.nextLine();
        }

        for (int i : numeros) {
            if (numero == i) {
                contador++;
            }
        }
        System.out.println("El numero aparece  = " + contador);
    }
}