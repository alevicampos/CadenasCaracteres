package org.example;

import java.util.Scanner;

public class Bucles1 {
    public void bucles1(){
        Scanner entrada = new Scanner(System.in);

        String psw = "entorno";
        String pswUsuario;

        do{
            System.out.println("Introduce tu contraseña");
            pswUsuario = entrada.next();
        }while(!pswUsuario.equals(psw));

        System.out.println("BIENVENIDO");
    }
}
