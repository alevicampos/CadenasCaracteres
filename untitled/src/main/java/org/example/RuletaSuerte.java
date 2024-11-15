package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RuletaSuerte {
    public void ruletasuerte(){

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        String[] colores  = {"rojo","negro"};
        Integer[] numeros =  new Integer[37];

        for (int i=0;i<numeros.length;i++){
            numeros[i] = i;
        }

        String[] tipoNumero = {"par","impar"};

        System.out.println("Número (0-36): ");
        int numeroUsuario = entrada.nextInt();

        boolean numeroEncontrado = Arrays.asList(numeros).contains(numeroUsuario);
        String color = "";
        String tipoNumeroUsuario = "";

        if (!numeroEncontrado){
            System.out.println("ERROR. El número no es válido.");
            return;
        }else{
            if (numeroUsuario!=0){
                System.out.println("Color (rojo-negro): ");
                color = entrada.next();

                boolean colorEncontrado = Arrays.asList(colores).contains(color);

                if (!colorEncontrado){
                    System.out.println("ERROR. El color no es válido.");
                    return;
                }else{
                    System.out.println("Introduce la opción par o impar: ");
                    tipoNumeroUsuario = entrada.next();
                    boolean parEncontrado = Arrays.asList(tipoNumero).contains(tipoNumeroUsuario);

                    if (!parEncontrado){
                        System.out.println("ERROR. La opción par/impar no es válida.");
                        return;
                    }

                }

            }

        }

        int numero_sorteo = numeros[random.nextInt(37)];
        String color_sorteo = colores[random.nextInt(2)];
        String pares_sorteo = "";

        if (numero_sorteo%2==0){
            pares_sorteo = "par";
        }else{
            pares_sorteo = "impar";
        }

        System.out.println("Ha tocado " + numero_sorteo +  " " +  color_sorteo + " " + pares_sorteo);

        //// falta dar premios
        if(numeroUsuario!=0 && numero_sorteo==numeroUsuario && color_sorteo.equals(color) && pares_sorteo.equals(tipoNumeroUsuario)){
            System.out.println("HAS GANADO!!");
        } else if (numeroUsuario!=0 && color_sorteo.equals(color)) {
            System.out.println("Has acertado el color.");
        } else if (numeroUsuario!=0 && pares_sorteo.equals(tipoNumeroUsuario)) {
            System.out.println("Has acertado la opción par/impar");
        } else if (numeroUsuario==numero_sorteo && numeroUsuario != 0) {
            System.out.println("Has acertado el número");
        } else if (numeroUsuario==0 && numero_sorteo==0) {
            System.out.println("HAS GANADO y los demás usuarios pierden.");
        }else{
            System.out.println("Has perdido.");
        }


    }

}
