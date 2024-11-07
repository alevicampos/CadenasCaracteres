package org.example;

import java.util.Scanner;

public class EjercicioArrays10 {
    public void ejercicioArrays10(){
       String palabras[] = {"Amparo", "Alejandra", "Patricia"};
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una letra");
        String letra = entrada.next().toUpperCase();
        char letraChar = letra.charAt(0);

        System.out.print("Las palabras que emiezan por "+letraChar+ " son: ");
        for(int i = 0; i< palabras.length; i++){
            String palabra = palabras[i];
            if (palabra.charAt(0) == letraChar){
                System.out.print(palabra+" ,");
            }
        }

    }
}
