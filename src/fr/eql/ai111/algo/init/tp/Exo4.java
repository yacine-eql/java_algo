package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

public class Exo4 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisissez votre age: ");
        int number1 = myScanner.nextInt();
        /////////////////////////////////////////////////////////////////////

        if (number1 > 6) {
            switch (number1) {
                case 6:
                case 7:
                    System.out.println("votre categorie est : . " + "Poussin.");
                    break;
                case 8:
                case 9:
                    System.out.println("votre categorie est : . " + "Pupille");
                    break;
                case 10:
                case 11:
                    System.out.println("votre categorie est : . " + "minime");
                    break;
                default:
                    System.out.println("votre categorie est : . " + "Cadet");
            }
        }
            System.out.println("l'enfant est trop jeune pour le moment");

    }

}

