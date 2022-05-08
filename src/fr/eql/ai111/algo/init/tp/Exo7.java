package fr.eql.ai111.algo.init.tp;

import java.util.Scanner;

//Ecrire un programme qui demande un nombre à l'utilisateur et qui affiche les dix
//premiers termes de la table de ce nombre.
//Exemple :
//Table de 7 :
//7 × 1 = 7
//7 × 2 = 14
//....
//7 × 10 = 70
public class Exo7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        int number = myScanner.nextInt();


        for (int i = 1; i <= 10; i++) {

            System.out.println(number  +  " x " + i + " = " + (number * i));

        }
    }
}
