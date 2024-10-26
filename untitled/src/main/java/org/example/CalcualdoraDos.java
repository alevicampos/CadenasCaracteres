package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcualdoraDos {
    public void calculadorados(){
        System.out.println("""
                ╔═.✵.═════════════════════════╗
                  BIENVENIDO A TU CALCULADORA
                ╚═════════════════════════.✵.═╝
                """);
        Scanner entrada = new Scanner(System.in);
        double primerOperando=0;
        double segundoOperando=0;
        double resultado;
        boolean error = true;
        boolean errordos = true;
        String signoPrimer;
        String signo;

           while (error) {
               try {
                   System.out.println("Introduce el primer operando (entero): ");
                   primerOperando = entrada.nextDouble();
                   error= false;
               } catch (InputMismatchException e) {
                   System.out.println("Debes introducir un número." + e.getMessage());
                   entrada.nextLine();
               }
           }

                   System.out.println("¿Qué operación deseas realizar \"+\", \"-\", \"*\", \"/\", \"R\"?");
                   signoPrimer = entrada.next();
                   signo = signoPrimer.toUpperCase();
        while (errordos) {
            try {

                if (signo.equals("+") || signo.equals("-") || signo.equals("*") || signo.equals("/")) {
                    System.out.println("Introduce el segundo operando: ");
                    segundoOperando = entrada.nextDouble();
                }
                errordos = false;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número." + e.getMessage());
                entrada.nextLine();
            }
        }

        switch (signo){
            case ("+"):
                resultado = primerOperando + segundoOperando;
                System.out.println("El resultado de la suma es = " + resultado);
                break;
            case ("-"):

                resultado = primerOperando-segundoOperando;
                System.out.println("El resultado de la resta es = " + resultado);
                break;
            case ("*"):

                resultado = primerOperando * segundoOperando;
                System.out.println("El resultado de la multiplicación es = " + resultado);
                break;
            case ("/"):

                if (segundoOperando != 0) {
                    resultado = primerOperando / segundoOperando;
                    System.out.println("El resultado de la división es = " + resultado);
                }else{
                    System.out.println("No se puede dividir por 0");
                }
                break;
            case ("R"):
                if (primerOperando >= 0) {
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

