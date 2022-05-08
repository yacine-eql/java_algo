package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
     int temps = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisissez un Nombre: ");
        int number1 = myScanner.nextInt();
        if ((number1 % 2) == 0 ) {

            System.out.println("la moitié du nombre: " + (number1/2) +" .");
        } else {
            temps = (number1*3) + 1;
            System.out.println("le triple + 1 : " + temps +" .");
        }
/////////////////////////expression ternaire /////////////////////////:
        /* temps = (0 == number % 2) ? (number * 2) : (number * 3 + 1);  */
    }
}
