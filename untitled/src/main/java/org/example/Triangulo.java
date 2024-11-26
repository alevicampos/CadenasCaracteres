package org.example;

public class Triangulo {
    public void triangulo(){
        String asterisco = "*";
        int altura = 4;

        for (int fila = altura; fila >= 1; fila--){
            for (int columna = altura; columna >= fila; columna--){
                System.out.print(asterisco);
            }
            System.out.println(" ");
        }
        for (int fila = 1; fila <= altura; fila++){
            for (int col = fila; col <= altura; col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}

