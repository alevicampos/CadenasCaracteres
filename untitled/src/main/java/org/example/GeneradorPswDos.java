package org.example;

import java.util.Random;

public class GeneradorPswDos {
    public void generadorpswdos(){
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";
        int posicion;
        int numeroCaracteresMax = random.nextInt(3)+6;
        for (int i= 1; i <= numeroCaracteresMax; i++) {
            posicion = random.nextInt(caracteres.length());

            contrasenya += caracteres.charAt(posicion);
        }
        System.out.println("La contraseña es: " + contrasenya);
    }
}
