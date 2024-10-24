package org.example;

import java.util.Random;

public class LanzamientoDados {
    public void lanzamientodados(){

        Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        int suma = dado1 + dado2;

        System.out.println("Lanzamiento del dado 1: " + dado1);
        System.out.println("Lanzamiento del dado 2: " + dado2);
        System.out.println("Suma total de los dos dados: " + suma);

    }
}
