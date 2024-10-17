package org.example;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Actividad {
    public void actividad() {
        System.out.println("""
                **********************************************
                * Bienvenido al Clasificador de GENERACIONES *
                **********************************************
                """);
        System.out.println("Elige el modo de ejecución:");
        System.out.println("\t 1. Año de nacimiento.");
        System.out.println("\t 2. Edad.");

        Scanner entrada = new Scanner(System.in);
        String modo = entrada.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyoActual = hoy.getYear();
        int anyo = 0;

        switch (modo){
            case "1":
                System.out.println("Introduce tu año de nacimiento:");
                String anyoNacimiento = entrada.next();


                try {
                    int anyoNacimientoNum = Integer.parseInt(anyoNacimiento);
                    if (anyoNacimientoNum<1900 || anyoNacimientoNum > anyoActual) {
                        System.out.println("El año introducido no es válido (1999<=año<=" + anyoActual + ").");
                    }else {
                        anyo = anyoNacimientoNum;
                    }
                } catch (NumberFormatException e1) {
                    System.out.println("El formato del año no es correcto. " + e1.getMessage());
                }finally {
                    entrada.nextLine();
                }
                break;
            case "2":
                System.out.println("Introduce tu edad:");

                if (entrada.hasNextInt()) {

                    int edad = entrada.nextInt();

                    if (edad < 0) {
                        System.out.println("La edad introducida no es correcta.");

                    } else {
                        anyo = anyoActual - edad;
                    }

                } else {
                    System.out.println("No has introducido una edad válida");
                }
                break;
            default:
                System.out.println("No se reconoce el modo.");
        }


//        if (modo.equals("1")) {
//            System.out.println("Introduce tu año de nacimiento:");
//            String anyoNacimiento = entrada.next();
//
//
//            try {
//                int anyoNacimientoNum = Integer.parseInt(anyoNacimiento);
//                if (anyoNacimientoNum<1900 || anyoNacimientoNum > anyoActual) {
//                    System.out.println("El año introducido no es válido (1999<=año<=" + anyoActual + ").");
//                }else {
//                    anyo = anyoNacimientoNum;
//                }
//            } catch (NumberFormatException e1) {
//                System.out.println("El formato del año no es correcto. " + e1.getMessage());
//            }finally {
//                entrada.nextLine();
//            }
//
//
//        } else if (modo.equals("2")) {
//            System.out.println("Introduce tu edad:");
//
//            if (entrada.hasNextInt()) {
//
//                int edad = entrada.nextInt();

//                if (edad < 0) {
//                    System.out.println("La edad introducida no es correcta.");
//
//                } else {
//                    anyo = anyoActual - edad;
//                }
//
//            } else {
//                System.out.println("No has introducido una edad válida");
//            }
//        }else {
//            System.out.println("No se reconoce el modo.");
//        }
        if (anyo!=0){

        if ( anyo >= 1900 && anyo <= 1927) {
            System.out.println("Eres de la generación sin bautizar");
        } else if (anyo >= 1928 && anyo <= 1944) {
                System.out.println("Eres de la generación Silent");
            } else if (anyo >= 1945 && anyo <= 1964) {
                System.out.println("Eres de la generación Boomers");
            } else if (anyo >= 1965 && anyo <= 1981) {
                System.out.println("Eres de la generación X");
            } else if (anyo >= 1982 && anyo <= 1994) {
                System.out.println("Eres de la generación Y o Millennials");
            }else if (anyo >= 1995 && anyo <= anyoActual) {
                    System.out.println("Eres de la generación Z o Centennials");
                }
                }
            }
        }

