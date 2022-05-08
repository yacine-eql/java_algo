package fr.eql.ai111.algo.init.demo;

import java.util.Scanner;

public class _5_DemoInput {
    public static void main(String[] args) {

        //on crée le scanner qui récupérera l'entrée utilisateur en console.
        // On affecte l'entrée utilisateur a la variable "nom" lorsque l'utilisateur appuie sur Antrée

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisisez votre Nom :");
        String name = myScanner.nextLine();
        System.out.println("Saisissez votre âge : ");
        int age = myScanner.nextInt();

        System.out.println("Bonjour " +  name + ".\r\nVous avez " + age + " ans.");

        myScanner.close();
    }
}
