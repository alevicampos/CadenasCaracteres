package org.example;

import java.util.Scanner;

public class PreExamen3 {
    public void preexamen3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿En cuántos meses desea pagar el producto?");
        int mesesFinaciacion = entrada.nextInt();
        int mes = 10;
        int resultado = 0;

        for (int i = 1; i <= mesesFinaciacion; i++) {
        resultado += mes;
        mes *= 2;

    }
        System.out.println("Total a pagar = " + resultado);
}

}
