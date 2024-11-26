package org.example;

import java.util.Scanner;

public class TablasClasificaciones {
    public void tablasclasificaciones() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿Cuántos estudiantes tiene?");
        int estudiantes = entrada.nextInt();
        System.out.println("¿Cuántas asignaturas tienen?");
        int asignaturas = entrada.nextInt();

        int filas = estudiantes + 1;
        int columnas = asignaturas + 1;

        String[][] matriz = new String[filas][columnas];

        // Inicializar encabezados de la matriz
        matriz[0][0] = "Estudiantes";

        // Introducir los nombres de las asignaturas
        entrada.nextLine(); // Consumir salto de línea pendiente

        for (int j = 1; j < columnas; j++) {
            System.out.print("Introduce el nombre de la asignatura " + j + ": ");
            matriz[0][j] = entrada.next();
        }

        // Introducir los nombres de los estudiantes
        for (int i = 1; i < filas; i++) {
            System.out.print("Introduce el nombre del estudiante " + i + ": ");
            matriz[i][0] = entrada.next();
        }

        // Insertar las notas de cada alumno para cada asignatura
        for (int i = 1; i < filas; i++) { // Empezar en 1 (no incluir encabezado)
            for (int j = 1; j < columnas; j++) {
                System.out.print("Inserta la nota de " + matriz[i][0] + " para la asignatura " + matriz[0][j] + ": ");
                matriz[i][j] = entrada.next();
            }
        }

        // Mostrar la matriz final
        System.out.println("\nTabla de Clasificaciones:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t\t");
            }
            System.out.println();
        }

        //nota media de todas las asignaturas por alumno
        int sumaNotasAsignaturas = 0;
        float media= 0;

        for (int i = 1; i < filas; i++) {
            sumaNotasAsignaturas = 0; // reinicio el valor para calcular la media del siguiente alumno
            for (int j = 1; j < columnas; j++) {
                sumaNotasAsignaturas += Integer.parseInt(matriz[i][j]);
            }
            media= sumaNotasAsignaturas/asignaturas;
            System.out.println("La nota media del alumno " + matriz[i][0]+ " es " +media);
        }
        //nota media por asignaturas

        float mediaAsignatura= 0;

        for (int i = 1; i < matriz[0].length; i++) {
            mediaAsignatura = 0; // reinicio el valor para calcular la media del siguiente alumno
            for (int j = 1; j < matriz.length; j++) {
                mediaAsignatura += Integer.parseInt(matriz[j][i]);
            }
            media= sumaNotasAsignaturas/estudiantes;
            System.out.println("La nota media del alumno " + matriz[0][i]+ " es " +mediaAsignatura);
        }

    }

}
