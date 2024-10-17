package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    public void ejercicio8(){

        boolean error = true;
        Scanner entrada = new Scanner(System.in);
        int dia= 0;


            try {

                System.out.println("Intoduce un número del 1 al 7: ");
                dia = entrada.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Has introducido valores no válidos");
                entrada.nextLine();

            }


        switch (dia) {
            case 1:
                System.out.println("El dia de la semana es Lunes.");
                break;
            case 2:
                System.out.println("El dia de la semana es Martes.");
                break;
            case 3:
                System.out.println("El dia de la semana es Miércoles.");
                break;
            case 4:
                System.out.println("El dia de la semana es Jueves.");
                break;
            case 5:
                System.out.println("El dia de la semana es Viernes.");
                break;
            case 6:
                System.out.println("El dia de la semana es Sábado.");
                break;
            case 7:
                System.out.println("El dia de la semana es Domingo.");
                break;
            default:
                System.out.println("El número introducido no es correcto");
        }
    }
}
