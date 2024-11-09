package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {
    public void samurais() {
        System.out.println("""
                        ▂▃▅▇█▓▒░BATALLA SAMURÁIS░▒▓█▇▅▃▂
                """);

        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        boolean errordos = true;
        String[] subPotenciaUno = new String[7];
        String[] subPotenciaDos = new String[7];

        // Solicito al jugador 1 que introduzca su potencia.
        while (error) {
            int sumaPotenciaUno = 0;

            System.out.print("""
                    JUGADOR 1: Introduce la potencia de tus jugadores (máximo 7 caracteres):
                                |
                    ////////////|---------------------------------,
                    `^^^^^^^^^^^|--------------------------------"
                                |
                    POTENCIA:""");
            String potenciaUno = entrada.nextLine();

            // Separo los caracteres y lo convierto a entero

            subPotenciaUno = potenciaUno.split(" ");
            System.out.println("Equipo 1: " +Arrays.toString(subPotenciaUno));

            // Compruebo que hayan 7 valores

            if (subPotenciaUno.length != 7) {
                System.out.println("ERROR: Tienen que haber 7 samurais.");
                continue; // Vuelve al inicio del bucle
            }


            try {

                // Compruebo que los valores estén entre 1 y 24 y si es así, realizo la suma de los números introducidos

                for (int i = 0; i< subPotenciaUno.length;i++) {
                    int subPotenciaUnoEntero = Integer.parseInt(subPotenciaUno[i]);
                    if (Integer.parseInt(subPotenciaUno[i]) > 24 || Integer.parseInt(subPotenciaUno[i]) <= 0) {
                        System.out.println("El Samurai tiene que tener una potencia comprendida entre 1 y 24");
                        System.out.println("La potencia del Samurai introducida ha sido de: " + Integer.parseInt(subPotenciaUno[i]));
                        break;
                    } else {
                        sumaPotenciaUno += subPotenciaUnoEntero;
                    }
                }
                // Compruebo que la potencia sea igual a 30

                if (sumaPotenciaUno == 30) {
                    System.out.println("Equipo completado");
                    error = false; // Salgo del bucle ya que los valores son válidos
                } else {
                    System.out.println("ERROR. La potencia total no suma 30.");
                }
                // Me aseguro que los valores introducidos sean números

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Asegúrate de introducir sólo números.");
            }
        }

        // Solicito al jugador 2 que introduzca su potencia.

        while (errordos) {
            int sumaPotenciaDos = 0;

            System.out.print("""
                    JUGADOR 2: Introduce la potencia de tus jugadores (máximo 7 caracteres):
                                |
                    ////////////|---------------------------------,
                    `^^^^^^^^^^^|--------------------------------"
                                |
                    POTENCIA:""");
            String potenciaDos = entrada.nextLine();



            // Separo los caracteres y lo convierto a entero

            subPotenciaDos = potenciaDos.split(" ");
            System.out.println("Equipo 2: " + Arrays.toString(subPotenciaDos));

            // Compruebo que hayan 7 valores

            if (subPotenciaDos.length != 7) {
                System.out.println("ERROR: Tienen que haber 7 samurais.");
                continue; // Vuelve al inicio del bucle
            }

            try {

                // Realizo la suma de los números introducidos

                for (int i = 0; i< subPotenciaDos.length;i++) {
                    int subPotenciaDosEntero= Integer.parseInt(subPotenciaDos[i]);
                    if(Integer.parseInt(subPotenciaDos[i])>24 || Integer.parseInt(subPotenciaDos[i])<=0 ){
                        System.out.println("El Samurai tiene que tener una potencia comprendida entre 1 y 24");
                        System.out.println("La potencia del Samurai introducida ha sido de: " + Integer.parseInt(subPotenciaDos[i]));
                        break;
                    }else {
                        sumaPotenciaDos += subPotenciaDosEntero;
                    }
                }

                // Compruebo que la potencia sea igual a 30

                if (sumaPotenciaDos == 30) {
                    System.out.println("Equipo completado");
                    errordos = false; // Salgo del bucle ya que los valores son válidos
                } else {
                    System.out.println("ERROR. La potencia total no suma 30.");
                }
                // Me aseguro que los valores introducidos sean números

            } catch (NumberFormatException e) {
                System.out.println("ERROR: Asegúrate de introducir sólo números.");
            }
        }

        // Elección del inicio de la batalla

        Random random = new Random();
        int indiceInicio = random.nextInt(7);
        System.out.println("La batalla inicia con el Samurai " + (indiceInicio + 1) + ".");

        int bajasEquipo1=0;
        int bajasEquipo2=0;
        int turno = indiceInicio;

        while (bajasEquipo1 <= 3 && bajasEquipo2 <= 3) {
            int potenciaSamurai1 = Integer.parseInt(subPotenciaUno[turno]);
            int potenciaSamurai2 = Integer.parseInt(subPotenciaDos[turno]);

            if (potenciaSamurai1 > potenciaSamurai2) {
                System.out.println("Samurai " + (turno + 1) + ". Gana Equipo 1. " + potenciaSamurai1 + " vs " + potenciaSamurai2);
                subPotenciaDos[turno] = "0"; // El samurái del equipo 2 muere
                bajasEquipo2++;
            } else if (potenciaSamurai1 < potenciaSamurai2) {
                System.out.println("Samurai " + (turno + 1) + ". Gana Equipo 2. " + potenciaSamurai1 + " vs " + potenciaSamurai2);
                subPotenciaUno[turno] = "0"; // El samurái del equipo 1 muere
                bajasEquipo1++;
            } else {
                System.out.println("Samurai " + (turno + 1) + ". Empate. " + potenciaSamurai1 + " vs " + potenciaSamurai2);
                subPotenciaUno[turno] = "0"; // Los dos samuráis mueren
                subPotenciaDos[turno] = "0";
                bajasEquipo1++;
                bajasEquipo2++;
            }

            // Avanzamos al siguiente turno.
            turno++;
            if (turno == 7) {
                turno = 0;
            }
        }

        // Declaramos el equipo ganador
        if (bajasEquipo1 > 3) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + bajasEquipo1 + " bajas.");
        } else if (bajasEquipo2 > 3) {
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + bajasEquipo2 + " bajas.");
        }else{
            System.out.println("¡HA HABIDO UN EMPATE! El Equipo 1 ha tenido " + bajasEquipo1 + " bajas. Y el Equipo 2 ha tendido " + bajasEquipo2 + " bajas." );
        }
        System.out.println("Equipo 1: " + Arrays.toString(subPotenciaUno));
        System.out.println("Equipo 2: " + Arrays.toString(subPotenciaDos));
    }
}



