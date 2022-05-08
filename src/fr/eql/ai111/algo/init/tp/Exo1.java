package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisissez un Nombre: ");
        int number1 = myScanner.nextInt();
        if (number1 > 0 ) {
            System.out.println("votre nombre : " + number1 +" est positif");
        } else if (number1 < 0 ){
            System.out.println("votre nombre : " + number1 +" est negatif");
        }else {
            System.out.println("ni l'un ni l'autre");
        }

              myScanner.close();
 //////////////////////////////////////////////////////////////////////////////////////////
    }
}
