package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        int reste = 0 ;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisissez un Nombre: ");
        int number1 = myScanner.nextInt();
        reste = number1 % 2;
        if ((reste) == 0 ) {
            System.out.println("votre nombre : " + number1 +" est Pair");
        } else {
            System.out.println("votre nombre : " + number1 +" est impair");
        }

        myScanner.close();

    }
}
