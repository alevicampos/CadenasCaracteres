package org.example;

import java.util.Random;

public class Aleatorios {
    public void aleatorios(){
        Random random = new Random();
        int aleatorio = random.nextInt();
        System.out.println("aleatorio = " + aleatorio);
        //numero del 1 al 3. El el bound ponemos la cantidad
        //de cifras que queremos que controle el random
        aleatorio = random.nextInt(3)+1;

        //es común que se use un next.double (imprime de 0 a 0.9999)

        double aleatorioDouble = random.nextDouble();

        // si queremos establecer un rango tenemos
        // que hacerlo fuera del paréntesis

        aleatorioDouble = random.nextDouble()*3+1;

        //existe una función para generar números aleatorios.
        // Math.random() que hace lo  mismo que un doble

        double numero_math = Math.random()*3+1;

    }
}
