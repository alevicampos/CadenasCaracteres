package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PreExamen1 {
    public void preexamen1(){

                Scanner entrada = new Scanner(System.in);
                int cantidad = 0;
                boolean error = true;

                // Pedir la cantidad de números con control de errores
                while (error) {
                    try {
                        System.out.println("¿Cuántos números?");
                        cantidad = entrada.nextInt();
                        error = false;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                        entrada.nextLine(); // Limpia el buffer de entrada
                    }
                }

                int numeroMayor = 0;
                int numeroMenor = 0;
                int numeroIgual = 0;

                // Bucle para leer los números y clasificarlos
                for (int i = 1; i <= cantidad; i++) {
                    boolean errorNumero = true;

                    while (errorNumero) {
                        try {
                            System.out.println("Introduce el número " + i + ":");
                            int numero = entrada.nextInt();
                            if (numero > 0) {
                                numeroMayor++;
                            } else if (numero < 0) {
                                numeroMenor++;
                            } else {
                                numeroIgual++;
                            }
                            errorNumero = false; // Salir del bucle si la entrada es correcta
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor, introduce un número entero.");
                            entrada.nextLine(); // Limpia el buffer de entrada
                        }
                    }
                }

                // Mostrar los resultados
                System.out.println("Número de valores positivos = " + numeroMayor);
                System.out.println("Número de valores negativos = " + numeroMenor);
                System.out.println("Número de valores iguales a cero = " + numeroIgual);
            }
        }

