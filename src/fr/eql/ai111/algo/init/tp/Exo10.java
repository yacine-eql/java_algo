package fr.eql.ai111.algo.init.tp;
//Ecrire un programme qui génère un nombre aléatoire compris entre 0 (inclus) et 100 (exclu),
//et qui propose au joueur de le deviner en 5 essais. A chaque essai, le programme donne un
//indice (« C’est plus petit » ou « C’est plus grand »). Si le joueur trouve avant que le nombre
//total d’essais soit épuisé, il gagne un point ; sinon, il perd un point. A la fin de chaque partie,
//le joueur a la possibilité d’arrêter de jouer ou de commencer une nouvelle partie.

import java.util.Random;
import java.util.Scanner;

public class Exo10 {
    public static void main(String[] args) {

        int index = 0;
        int points = 0;
        String retry ;

        do {
            Scanner myScanner = new Scanner(System.in);
            Random random = new Random();
            int myRandom = random.nextInt(50);
            System.out.println(myRandom);     //test
            do {
                System.out.println("Entrez votre nombre compris entre 0 et 50 :");
                int number = myScanner.nextInt();
                if (number < myRandom) {
                    System.out.println("Votre nombre est plus grand");
                } else if (number > myRandom) {
                    System.out.println("Votre nombre est plus petit");
                } else  {
                    System.out.print("Bravo, vous avez gagné un point. ");
                    points = points + 2;
                    index = 5;
                }
                index++;

            } while (index < 5);
            points--;
            if (points < 0){
                points = 0;
            }
            index = 0;
            System.out.println(" Total cumulés : " + points + " Points");
            System.out.println("Voulez vous recommencer oui / non ");
            retry = myScanner.next();

        }while ( retry.equals("oui") );

    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
/*
        Random myRandom = new Random();
        Scanner myScanner = new Scanner(System.in);
        String replay = "";
        int score = 0;
        do {
        int target = myRandom.nextint(50)+1;
        int playerInput;
        int nbMaxTries = 5;
        int nbTry = 0;
        do {
        nbTry++
        system.out.println("entre un nombre compris entre 0 et 10");
        playerInput =myScanner.nextint();
        if (playerinput > target){
        system.out.println("trop grand");
        }else if (playerinput < target){
        system.out.println("trop petit");
        }
        if (nbMaxTries -nbTry > 0 && playeurInput !=target) {
        system.out.println("encore" + (nbMaxTries - nbTry + " essaies");
        }while (playerInput !=target && nbTry <nbMaxTries);

        if (playerInput ==target) {
        score++ ;
        system.out.println("bravo vous avez trouvez " + nbTry + "essaies");
        }else {
          score--
          system.out.println("dommage le nombre était" + target + "votre score est " + score);
        }

        system.out.println("souhaitez vous rejouer o/n");
        replay = myScanner.next();
        }while (!replay.equals("n"));

        system.out.println("Fin de jeux");
 */