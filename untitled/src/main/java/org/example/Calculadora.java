package org.example;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    public void calculadora() {

        System.out.println("""
                *******************************
                * BIENVENIDO A TU CALCULADORA *
                *******************************
                """);
        Scanner entrada = new Scanner(System.in);
        double primerOperando=0;
        double segundoOperando;
        double resultado;
        boolean error= true;

        while (error) {
            try {
                System.out.println("Introduce el primer operando (entero): ");
                primerOperando = entrada.nextDouble();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número." + e.getMessage());
                entrada.nextLine();
            }
        }

        System.out.println("¿Qué operación deseas realizar \"+\", \"-\", \"*\", \"/\", \"R\"?");
        String signoPrimer = entrada.next();
        String signo = signoPrimer.toUpperCase(Locale.ROOT);

        switch (signo){
            case ("+"):
                System.out.println("Introduce el segundo operando: ");
                segundoOperando = entrada.nextDouble();
                resultado = primerOperando + segundoOperando;
                System.out.println("El resultado de la suma es = " + resultado);
                break;
            case ("-"):
                System.out.println("Introduce el segundo operando: ");
                segundoOperando = entrada.nextDouble();
                resultado = primerOperando-segundoOperando;
                System.out.println("El resultado de la resta es = " + resultado);
                break;
            case ("*"):
                System.out.println("Introduce el segundo operando: ");
                segundoOperando = entrada.nextDouble();
                resultado = primerOperando * segundoOperando;
                System.out.println("El resultado de la multiplicación es = " + resultado);
                break;
            case ("/"):

                System.out.println("Introduce el segundo operando: ");
                segundoOperando = entrada.nextDouble();
                if (segundoOperando != 0) {
                    resultado = primerOperando / segundoOperando;
                    System.out.println("El resultado de la división es = " + resultado);
                }else{
                    System.out.println("No se puede dividir por 0");
                }
                break;
            case ("R"):
                if (primerOperando >0) {
                    resultado = Math.sqrt(primerOperando);
                    System.out.println("El resultado de la raíz cuadrada es = " + resultado);
                }else{
                        System.out.println("El operando no puede ser negativo");
                    }
                break;
            default:
                System.out.println("El operando introducido no es válido");


        }

    }
}
