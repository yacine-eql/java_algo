package fr.eql.ai111.algo.init.tp;
/*
Ecrire un programme qui demande à l’utilisateur un login et un mot de passe. Si le login
renseigné est « admin » et le mot de passe « 123Soleil », le programme souhaite la bienvenue
à l’utilisateur sur le Super Calculateur ; autrement, l’utilisateur reçoit un message « Login
et/ou Password incorrect(s) ». Arrivé sur le Super Calculateur, le programme demande à
l’utilisateur deux opérandes ainsi qu’une opération (addition, soustraction, multiplication,
division). Enfin, le programme affiche le résultat de l’opération.
 */


import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        String admi = "admin";
        String motdepasse = "123Soleil";

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Saisissez votre login: ");
        String login = myScanner.nextLine();
        System.out.println("Saisissez votre mot de passe : ");
        String code = myScanner.next();

        if ((login.equals(admi)) && (code.equals(motdepasse))) {
            System.out.println("Bienvenue sur le super calculateur ");
            System.out.println("entrez deux operandes :");
            int x = myScanner.nextInt();
            int y = myScanner.nextInt();

            System.out.println("quel operation desirez vous \n addition : + \n multiplication :\n * " +
                    "soustraction - \n et div pour /:");
            String operation = myScanner.next();
            switch (operation) {
                case "+":
                    System.out.println("vous avez choisi une addition le resultat =  " + (x + y));
                    break;
                case "*":
                    System.out.println("vous avez choisi la multiplication le resultat =  " + (x * y));
                    break;
                case "-":
                    System.out.println("vous avez choisi la soustraction le resultat = " + (x - y));
                    break;
                case "/":
                    if (y == 0){
                        System.out.println("on ne peux pas diviser par 0");
                    }else {
                        System.out.println("vous avez choisi la division le resultat =  " + (x / y));
                    }
                    break;
                default:
                    System.out.println("vous faites le malin.");


            }
        } else {
            System.out.println("Login et/ou Password incorrect");
        }
    }
}