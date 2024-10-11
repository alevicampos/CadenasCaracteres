package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6(){
        System.out.println("""
                
                ***********************
                * NÚMERO DE LA SUERTE *
                ***********************
                """);
        Scanner entrada = new Scanner(System.in);
        String fecha = "DD/MM/AAAA";
        boolean error = true;


        while ( error ){
            try{
                System.out.println("Introduce tu fecha de nacimiento DD/MM/AAAA");
                fecha = entrada.nextLine();
                error = false;
            }catch (InputMismatchException Error){
                System.out.println("La fecha introducida no es válida");
                entrada.nextLine();
            }
        }

            String separador1 = fecha.substring(2,3);
            String separador2 = fecha.substring(5,6);

                String dia = fecha.substring(0, 2);
                int diaNumero = Integer.parseInt(dia);
                String mes = fecha.substring(3, 5);
                int mesNumero = Integer.parseInt(mes);
                String anyo = fecha.substring(6, 10);
                int anyoNumero = Integer.parseInt(anyo);
                int numeroSuma = diaNumero + mesNumero + anyoNumero;
                String suma = Integer.toString(numeroSuma);
                String primerDigito = suma.substring(0, 1);
                int numeroPrimerDigito = Integer.parseInt(primerDigito);
                String segundoDigito = suma.substring(1, 2);
                int numerosegundoDigito = Integer.parseInt(segundoDigito);
                String tercerDigito = suma.substring(2, 3);
                int numerotercerDigito = Integer.parseInt(tercerDigito);
                String cuartoDigito = suma.substring(3, 4);
                int numerocuartoDigito = Integer.parseInt(cuartoDigito);
                int numeroSuerte = numeroPrimerDigito + numerosegundoDigito + numerotercerDigito + numerocuartoDigito;


        while ( fecha.length() != 10 || !separador1.equals("/") || !separador2.equals("/") || diaNumero <= 0 || mesNumero <= 0 || anyoNumero <= 0 || diaNumero >31 || mesNumero >12 || anyoNumero > 2025) {
            System.out.println("La fecha introducida no es válida");
            System.out.println("Introduce tu fecha de nacimiento DD/MM/AAAA");
            fecha = entrada.nextLine();
        }
            System.out.println("numeroSuerte = " + numeroSuerte);
        }

            }




