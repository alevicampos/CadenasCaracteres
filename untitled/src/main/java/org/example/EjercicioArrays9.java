package org.example;

public class EjercicioArrays9 {
    public void ejercicioArrays9(){
        String[] palabras = {"Pepe", "Luis", "Amparo", "Alejandra", "Supercalifragilistico"};
        String palabraMasLarga = "";

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > palabraMasLarga.length()) {
                palabraMasLarga = palabras[i];
            }
        }

        System.out.println("La palabra más larga es: " + palabraMasLarga);
        }
    }

