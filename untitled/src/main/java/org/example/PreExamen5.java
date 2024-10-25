package org.example;

import java.util.Scanner;

public class PreExamen5 {
    public void preexamen5(){
        Scanner entrada = new Scanner(System.in);
        int sueldoMasDeMil =0;

        System.out.println("Introduce el sueldo 1:");
        int sueldoMayor = entrada.nextInt();
        if (sueldoMayor>1000){
            sueldoMasDeMil++;
        }

        for (int i= 2; i<= 5;i++){
            System.out.println("Introduce el sueldo "+i+":");
            int sueldo = entrada.nextInt();

            if (sueldo > sueldoMayor){
                sueldoMayor= sueldo;
            }

            if (sueldo>1000){
                sueldoMasDeMil ++;

            }
        }
        System.out.println("El sueldo mayor es:" +sueldoMayor);
        System.out.println("Hay "+sueldoMasDeMil+ " sueldos que superan los 1000 euros");

    }
}
