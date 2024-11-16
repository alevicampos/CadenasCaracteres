package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoteriaPrimitiva {
    public void loteriaprimitiva() {
        System.out.println("*** Lotería Primitiva ***");
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        String[] subdatos = new String[7];


        // Validación de la jugada
        boolean validacionCorrecta = false;

        //mientras que los números no estén entre 1 y 49 el programa solicitará nuevamente los números

        while (!validacionCorrecta) {

            // Jugada del usuario
            System.out.print("Introduce los datos de tu boleto (formato: N-N-N-N-N-N/R): ");
            String datos = entrada.next();

            // Verificación de formato
            boolean formato = datos.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}");
            if (!formato) {
                System.out.println("Formato incorrecto. Debe cumplir el formato N-N-N-N-N-N/R.");
                return;  // Si el formato no es correcto sale del programa
            }

            // Convertir el String introducido en un array

            subdatos = datos.split("[-/]");
            System.out.println("Boleto del usuario: " + Arrays.toString(subdatos));

            // Validación de números dentro del rango [1-49]

            validacionCorrecta = true; // Supongo que es válido, y se invalidará si encontramos algún error

            for (int i = 0; i < subdatos.length-1; i++) {  // Excluyo el reintegro (length-1)

                    int numero = Integer.parseInt(subdatos[i]); // Convertimos el String a int
                    if (numero < 1 || numero > 49) {
                        validacionCorrecta = false;
                        System.out.println("El número " + numero + " no está entre 1 y 49.");
                    }

            }
            // Compruebo que el reintegro se encuentre dentro del rango [0-9]
            // El reintegro se encuentra en el índice 6
            if (Integer.parseInt(subdatos[6]) < 0 || Integer.parseInt(subdatos[6]) > 9){
                validacionCorrecta = false;
                System.out.println("El número del Reintegro " + subdatos[6] + " no está entre 0 y 9");
            }
        }

        // Sorteo de las 6 primeras bolas

        int[] seisBolas = new int[6];
        for (int i = 0; i < seisBolas.length; i++) {
            boolean duplicado;
            int bola;
            do {
                duplicado = false;
                bola = random.nextInt(49) + 1; // Generar número entre 1 y 49

                // Verificar si el número ya existe en el array
                for (int j = 0; j < i; j++) {
                    if (seisBolas[j] == bola) {
                        duplicado = true;
                        break;
                    }
                }
            } while (duplicado);
            seisBolas[i] = bola;
        }

        // Ordeno los números antes de mostrarlos

        Arrays.sort(seisBolas);
        System.out.println("Ha salido: " + Arrays.toString(seisBolas));

        // Sorteo número complementario

        int complementario = random.nextInt(49) + 1;
        boolean repetir = true;
        while (repetir) {
            repetir = false;
            for (int i = 0; i < seisBolas.length; i++) {
                if (seisBolas[i] == complementario) {
                    complementario = random.nextInt(49) + 1;
                    repetir = true;
                    break;
                }
            }
        }

        System.out.println("Complementario: " + complementario);

        // Validar si el número complementario se encuentra entre los 6 números elegidos por el usuario

        boolean aciertoComplementario = false;
        for (int i = 0; i < subdatos.length - 1; i++) { // Excluyo el reintegro (length-1)
            if (Integer.parseInt(subdatos[i]) == complementario) {
                aciertoComplementario = true;
                break;
            }
        }

        // Sorteo Reintegro entre 0 y 9

        int reintegro = random.nextInt(10);
        System.out.println("Reintegro = " + reintegro);

        // Calcular si el reintegro del usuario coincide con el del sorteo

        int reintegroUsuario = Integer.parseInt(subdatos[6]); // El reintegro está en el índice 6
        boolean aciertaReintegro = (reintegroUsuario == reintegro);

        // Contar los aciertos de los números del usuario

        int aciertos = 0;
        for (int i = 0; i < subdatos.length - 1; i++) { // Excluimos el reintegro del usuario
            for (int j = 0; j < seisBolas.length; j++) {
                if (Integer.parseInt(subdatos[i]) == seisBolas[j]) {
                    aciertos++; // Incremento el contador de aciertos
                }
            }
        }

        System.out.println("Aciertos: " + aciertos);

        // Determinar la categoría del premio

        if (aciertos == 6 && aciertaReintegro) {
            System.out.println("Categoría Especial: ¡Has acertado los seis números y el reintegro!");
        } else if (aciertos == 6) {
            System.out.println("1ª Categoría: ¡Has acertado los seis números!");
        } else if (aciertos == 5 && aciertoComplementario) {
            System.out.println("2ª Categoría: ¡Has acertado cinco números y el complementario!");
        } else if (aciertos == 5) {
            System.out.println("3ª Categoría: ¡Has acertado cinco números!");
        } else if (aciertos == 4) {
            System.out.println("4ª Categoría: ¡Has acertado cuatro números!");
        } else if (aciertos == 3) {
            System.out.println("5ª Categoría: ¡Has acertado tres números!");
        } else if (aciertaReintegro) {
            System.out.println("Reintegro: ¡Has acertado el reintegro!");
        } else {
            System.out.println("No premiado.");
        }
    }
}


