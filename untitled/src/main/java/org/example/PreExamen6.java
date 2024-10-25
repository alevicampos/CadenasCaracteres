package org.example;

import java.util.Scanner;

public class PreExamen6 {
    public void preexamen6() {
        Scanner entrada = new Scanner(System.in);
        int edadMayor = 0;
        double sumaEdad = 0;
        double edadMedia;
        double sumaEstatura = 0;
        double estaturaMedia;
        int estaturaMayor = 0;
        System.out.println("¿Cuántos alumnos vas a introducir?");
        int cantidadAlumnos = entrada.nextInt();

        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.println("Introduce la edad el alumno " + i + ":");
            double edad = entrada.nextDouble();
            sumaEdad += edad;
            System.out.println("Introduce la estatura del alumno " + i + ":");
            double estatura = entrada.nextDouble();
            sumaEstatura += estatura;
            if (edad > 18) {
                edadMayor++;
            }
            if (estatura>175){
                estaturaMayor++;
            }
        }

        edadMedia = sumaEdad / cantidadAlumnos;
        System.out.println("La edad media de los alumnos es = " + edadMedia);
        estaturaMedia = sumaEstatura / cantidadAlumnos;
        System.out.println("La estatura media de los alumnos es = " + estaturaMedia);
        System.out.println("Hay " + edadMayor+ " alumnos con más de 18 años");
        System.out.println("Hay " + estaturaMayor+ " alumnos que miden mas de 175 cm");
    }

}
