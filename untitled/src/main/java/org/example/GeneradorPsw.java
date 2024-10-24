package org.example;

import java.util.Random;

public class GeneradorPsw {
    public void generadorpsw(){

        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";

        int posicion;
        for (int i= 1; i < 8; i++) {
            posicion = random.nextInt(caracteres.length());

           contrasenya += caracteres.charAt(posicion);
        }
        System.out.println("La contraseña es: " + contrasenya);
    }
}
