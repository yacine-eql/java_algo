package fr.eql.ai111.algo.init.tp;


import java.util.Scanner;

//Ecrire un programme qui demande un nombre à l'utilisateur et qui affiche les dix
//nombres suivants.
public class Exo6 {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entrez votre nombre :");
        int number = myScanner.nextInt();

        for (int i = 0; i < 10; i++){
            number++ ;
            System.out.println(number);
        }
///////////////// (int i = number +1; i<= number +10; i++)////////////////////////////////::
    }
}
