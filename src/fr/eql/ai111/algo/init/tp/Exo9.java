package fr.eql.ai111.algo.init.tp;

public class Exo9 {
    public static void main(String[] args) {

        int size = 7;
        int nbSpaces, nbStars ;

        for (int row = 0; row < size; row++) {

            //calculer le nombre d'espaces a afficher
            nbSpaces = size - row - 1;
            // calculer le nombre d'etoile a afficher

            nbStars = row * 2 + 1;
            //afficher le nombre d espace
            for (int i = 0; i < nbSpaces; i++) {
                System.out.print(" ");
            }
            //afficher le nombre d etoile
            for (int i = 0; i < nbStars; i++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
/////////////////////////////////////////////////////////////////////////////////////////
}
