package fr.eql.ai111.algo.init.demo;

import java.util.Scanner;

public class _7_DemoLoops {
    public static void main(String[] args) {

     /////////////////////////////////////////////////////////////////////////////////////////////:
        System.out.println("*** Boucle FOR ***");

        for (int i = 1; i < 10; i++) {
            System.out.println(i + "  tours dans la boucle");
        }
        String word = " tour";
        for (int i = 1; i < 10; i++) {
            if (i == 2){
                word += "s";
            }
            System.out.println(i + word + " dans la boucle");

        }
  //////////////////////////////////////////////////////////////////////////////////////////
        int i = 0;
        System.out.println("i : " + i);
        System.out.println("i++ : " + i++); // affichage puis incrementation
        System.out.println("i : " +  i);

         i = 0;
        System.out.println("i : " + i);
        System.out.println("++1 : " + ++i); // incrementation puis affichage
        System.out.println("i : " +  i);
  ////////////////////////////////////////////////////////////////////////////////////////////

             Scanner mySanner = new Scanner(System.in);

        System.out.println("\r\n**** boucle while  *****");
        System.out.println("veuillez tapper un  nombre positif");
        int number = mySanner.nextInt();

        while (number < 0){
            System.out.println("erreur ! votre nombre n'est pas positif \r\nTappez un nombre positif");
            number = mySanner.nextInt();
        }
        System.out.println("bravo vous avez rentrez un nombre positif");

        ////////////////////////////////////////////////////////////////////////////////

        System.out.println("\r\n**** boucle do while **********");

        float credit = 1000.0f;
        float payment ;

        do {
            System.out.println("votre credi est de " + credit + "€.\r\n" +
                    "quelle somme souhaitez vous ?");
            payment = mySanner.nextFloat();
            credit = payment ;

        }while (credit > 0);
        System.out.println(" merci votre payment est remboursé");
    }

}
