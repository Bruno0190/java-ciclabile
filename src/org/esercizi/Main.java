package org.esercizi;

import java.util.Arrays;
import java.util.Scanner;

import org.esercizi.cicli.Ciclabile;

public class Main {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer dimensione = 1;

        System.out.println("Dobbiamo costruire un array di numeri interi. Comincia a digitare il primo");
        int num1 = input.nextInt();

        int[] mioArray = new int[1];
        mioArray[0] = num1;


        String risposta = "";

        while(risposta.equals("s")) {

            System.out.println("Altri numeri? Digita s/n");
            risposta = input.nextLine();
            System.out.println("Prossimo numero.");
            int num = input.nextInt();
            
            dimensione++;
            int[] nuovoMioArray = Arrays.copyOf(mioArray, dimensione);
            nuovoMioArray[dimensione-1] = num;
            mioArray = nuovoMioArray;

        }
        
        Ciclabile ciclo = new Ciclabile(mioArray);
        
        System.out.println(ciclo.getElementoSuccessivo());
        System.out.println(ciclo.getElementoSuccessivo());
        System.out.println(ciclo.getElementoSuccessivo());
        
        ciclo.hasAncoraElementi();

        input.close();
        
    }


}
