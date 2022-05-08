package fr.eql.ai111.algo.init.demo;

import java.util.Scanner;

public class _6_DemoSwitch {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String weapon = "";
        System.out.println("Un troll vous attaque. quelle arme" + "souhaitez vous utiliser ? (épée/arc/baton)");
        weapon = myScanner.nextLine();
        switch (weapon) {
            case "épée" :
                System.out.println("vous avez choisi la voie du guerrier. " + "Votre coup d'épée fait perdre 2pv au troll.");
                break;
            case "arc" :
                System.out.println("vous avez choisi la voie du chasseur. " + "Votre flèche fait perdre 1pv au troll.");
                break;
            case "baton" :
                System.out.println("vous avez choisi la voie du magicien. " + "Votre baton fait perdre 3pv au troll.");
                break;
            default:
                System.out.println("vous faites le malin. " + "vous etes donc tout nu face face  au troll");



        }
        myScanner.close();

    }
}
