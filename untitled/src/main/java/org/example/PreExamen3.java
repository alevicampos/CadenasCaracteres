package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreExamen3 {
    public void preexamen3() {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int mesesFinaciacion= 0;
        while (error || mesesFinaciacion<=0) {
            try {
                System.out.println("¿En cuántos meses desea pagar el producto?");
                mesesFinaciacion = entrada.nextInt();
                if (mesesFinaciacion <= 0) {
                    System.out.println("No puedes introducir numeros negativos");
                    error = true;
                }
                error = false;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                entrada.nextLine();

            }
        }

            int mes = 10;
            int resultado = 0;

            for (int i = 1; i <= mesesFinaciacion; i++) {
                resultado += mes;
                mes *= 2;

            }
            System.out.println("Total a pagar = " + resultado);

}

}
