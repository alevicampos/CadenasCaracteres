package org.example;

import java.util.Scanner;

public class Bucles5 {
    public void bucles5(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();

        for (int i=1; i <= 10; i++ ){
            int resultado = num*i;
            System.out.println( +num + " X " + i+ " = " +resultado);
        }
    }
}
