package org.example;

import java.util.Scanner;

public class IsbnComprobador {
    public void isbncomprobador(){

        System.out.println("╔═.✵.═══════════════════════════════╗");
        System.out.println(" BIENVENIDO AL COMPROBADOR DE ISBN");
        System.out.println("╚═══════════════════════════════.✵.═╝");

        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int ultimoDigito= 0;

        System.out.print("Introduzca ISBN: ");
        String isbn = entrada.next();

        if (isbn.length() != 10) {
            System.out.println("El ISBN debe tener 10 caracteres.");
            return;
        }

        int posicion = isbn.indexOf('?');

        try {

        for (int i = 0; i < 9; i++) {
            if (i == posicion) {
                continue;
            }
            int digito;

                if (isbn.charAt(i) == 'X' || isbn.charAt(i) == 'x') {
                    digito = 10;

                } else {
                    digito = Integer.parseInt(isbn.substring(i, i + 1));

                }

                suma += digito * (10 - i);

        }

        if (isbn.charAt(9) == 'X' || isbn.charAt(9) == 'x') {
            ultimoDigito = 10;
        } else {
            ultimoDigito = Integer.parseInt(isbn.substring(9,10));

        }
        }catch (NumberFormatException e){
            System.out.println("Has introducido un caracter que no está permitido." + e.getMessage());
            entrada.nextLine();
        }

        if (posicion != -1) {
            for (int digito = 0; digito <= 9; digito++) {
                int sumaTemporal = suma + digito * (10 - posicion) + ultimoDigito;
                if (sumaTemporal % 11 == 0) {
                    System.out.println("El dígito que falta es: " + digito);
                    return;
                }
            }
            System.out.println("No se encontró un dígito válido para completar el ISBN.");
        } else {

            suma += ultimoDigito;
            if (suma % 11 == 0) {
                System.out.println("El ISBN es válido.");
            } else {
                System.out.println("El ISBN no es válido.");
            }
        }
    }
}

