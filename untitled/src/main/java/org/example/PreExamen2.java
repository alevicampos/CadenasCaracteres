package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PreExamen2 {
    public void preexamen2(){

                Scanner entrada = new Scanner(System.in);
                boolean error = true;
                int base = 0;
                int exponente = 0;

                // Bucle para pedir la base y el exponente con control de errores
                while (error) {
                    try {
                        System.out.println("Valor de la base:");
                        base = entrada.nextInt();

                        System.out.println("Valor del exponente:");
                        exponente = entrada.nextInt();

                        if (exponente < 0) {
                            System.out.println("El exponente no puede ser negativo. Inténtalo de nuevo.");
                        } else {
                            error = false; // Solo saldrá del bucle si el exponente es válido (no negativo)
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                        entrada.nextLine(); // Limpiar el buffer de entrada
                    }
                }

                // Cálculo de la potencia
                int resultado = 1;
                for (int i = 0; i < exponente; i++) {
                    resultado *= base;
                }

                // Mostrar el resultado
                System.out.println("Resultado = " + resultado);
            }
        }



