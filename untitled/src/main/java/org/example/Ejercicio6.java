package org.example;

import java.util.Scanner;

public class Ejercicio6 {
    public void ejercicio6(){
        System.out.println("""
                
                ***********************
                * NÚMERO DE LA SUERTE *
                ***********************
                """);
        Scanner entrada = new Scanner(System.in);
        String fecha= "DD/MM/AAAA";
        boolean error = true;

        int diaNumero = 0;
        int mesNumero = 0;
        int anyoNumero = 0;


            while (error){
                try {
                    System.out.println("Introduce tu fecha de nacimiento DD/MM/AAAA1");
                    fecha = entrada.nextLine();
                    String dia = fecha.substring(0, 2);
                    diaNumero = Integer.parseInt(dia);
                    String mes = fecha.substring(3, 5);
                    mesNumero = Integer.parseInt(mes);
                    String anyo = fecha.substring(6, 10);
                    anyoNumero = Integer.parseInt(anyo);
                    error =false;

                } catch (NumberFormatException Error) {
                    System.out.println("La fecha introducida no es válida 2");
                    entrada.nextLine();
                }
            }
                String separador1 = fecha.substring(2,3);
                String separador2 = fecha.substring(5,6);

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
            System.out.println("La fecha introducida no es válida 3");
            System.out.println("Introduce tu fecha de nacimiento DD/MM/AAAA2");
            fecha = entrada.nextLine();

        }
            System.out.println("Tu número de la suerte es: " + numeroSuerte);
        }
            }




