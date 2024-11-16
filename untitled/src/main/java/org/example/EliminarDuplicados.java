package org.example;

import java.util.Arrays;
import java.util.Random;

public class EliminarDuplicados {
    public void eliminarduplicados() {
//
//        int [] original = {1,1,6,7,8,8,10,15,15};
//
//        int [] auxiliar= new int[original.length];
//
//        int tamanyo = 0;
//
//        for (int i = 0; i < original.length; i++ ) {
//
//            //mi original [i] Vs original [i+1]
//            if (i != original.length - 1 && original[i] == original[i + 1]) {
//                System.out.println("Duplicado = " + i);
//            } else {
//                auxiliar[i] = original[i];
//                tamanyo++;
//            }
//        }
//            System.out.println(Arrays.toString(auxiliar));
//
//            int[] limpio = new int[tamanyo];
//            int posicion =0;
//            for (int i= 0; i< auxiliar.length; i++){
//                if (auxiliar[i]!=0){
//                    limpio[posicion]= auxiliar[i];
//                    posicion++;
//                }
//            }
//            System.out.println(Arrays.toString(limpio));
//
//        int [] original = {1,1,6,7,8,8,10,15,15};
//
//        int tamanyo = 0;
//
//        for (int i = 0; i < original.length; i++ ) {
//
//            //mi original [i] Vs original [i+1]
//            if (i != original.length - 1 && original[i] == original[i + 1]) {
//                System.out.println("Duplicado = " + i);
//                original[i]= 0;
//            } else {
//                tamanyo++;
//            }
//        }
//
//        int[] limpio = new int[tamanyo];
//        int posicion =0;
//        for (int i= 0; i < original.length; i++){
//            if (original[i]!=0){
//                limpio[posicion]= original[i];
//                posicion++;
//            }
//        }
//        System.out.println(Arrays.toString(limpio));
//
//        int[] original = {1, 1, 6, 7, 8, 8, 10, 15, 15};
//        Random random = new Random();
//
//        int tamanyo = 0;
//        boolean repetir = true;
//
//        while (repetir) {
//
//        repetir = false;
//        for (int i = 0; i < original.length; i++) {
//
//            //mi original [i] Vs original [i+1]
//            if (i != original.length - 1 && original[i] == original[i + 1]) {
//                System.out.println("Duplicado = " + i);
//                original[i] = random.nextInt(49) + 1;
//                repetir= true;
//            }
//        }
//        Arrays.sort(original);
//        System.out.println(Arrays.toString(original));
//    }

        // Metodo distinct()

        int[] vector = {3,3,7,8,8,9,10,15,15};
        int[] vector2 = Arrays.stream(vector).distinct().toArray();
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vector2));
        }
    }

