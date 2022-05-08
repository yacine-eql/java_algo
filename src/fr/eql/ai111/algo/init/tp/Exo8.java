package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

public class Exo8 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entrez votre nombre positif:");
        int number = myScanner.nextInt();
        int result = 1 ;
        if (number < 0) {
            System.out.println("le nombre n'est pas positif");
        } else {
           for (int i = number ; i >= 1 ; i-- ) {
               result *= i ;

           }
            System.out.println(result);
        }

    }
}
