package fr.eql.ai111.algo.init.demo;

public class _8_DemoIfElse {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("if condition");
        if ((x == 1) || (x >= 1000)) {
            System.out.println("au moin une des deux conditions est remplie");

        } else {
            System.out.println("aucune des deux conditions n'est remplie");
        }

        System.out.println("\r\n *** condition avec operateur ou explusif xor ***");
        if ((x == 1) ^ (x >= 0)) {
            System.out.println("une seule des deux conditions est remplie");
        } else {
            System.out.println("les deux conditions sont remplies ou aucune des deux");
        }

        System.out.println("\r\n *** condition avec operateur ET ***");
        if ((x == 1) && (x >= 1000)) {
            System.out.println("les deux conditions sont remplies");
        } else if (x <= 2) {
            System.out.println("une condition alternative est remplie");
        } else {
            System.out.println("ni la premiere serie de condition, " + " ni la deuxieme, ,e sont remplie.");
        }

        System.out.println("\r\n *** Négation Lois de Morgan xor ***");
        boolean istrue, isAlsoTrue;

        System.out.println("\r\n *** Négation avec OU ***");
        /*
        La négation de la disjonction de deux proposotions est équivalante à la conjonction des négations des
        deux propositions, ce qui signifie que
        " non (A ou B) est identique à  " (non A) et (non B) "
         */
        istrue = ((x == 0) || (x != 1));
        // est equivalent à
        isAlsoTrue = !(x == 0) && !(x != 1);
        if (istrue && isAlsoTrue) {
            System.out.println("les deux conditions equivalentes sont remplies");
        } else {
            System.out.println("aucune des deux conditions n'est remplie, " + " ou elles ne sont pas equivalentes.");
        }

        System.out.println("\r\n *** Négation avec ET ***");
        /*
        La négation de la disjonction de deux proposotions est équivalante à la disconjonction des négations des
        deux propositions, ce qui signifie que
        " non (A et B) est identique à  " (non A) ou (non B) "
        */

        istrue = !((x == 0) && (x >= 1000));
        // est equivalent à
        isAlsoTrue = !(x == 0) || !(x >= 1000);
        if (istrue && isAlsoTrue) {
            System.out.println("les deux conditions equivalentes sont remplies");
        } else {
            System.out.println("aucune des deux conditions n'est remplie, " + " ou elles ne sont pas equivalentes.");
        }

        System.out.println("\r\n *** Operateurs logiques et bit a bit ***");
        String error = null ;

        /*if ( (x >= 0) || error.isEmpty() ) {
            System.out.println(" OU : La deuxieme condition n'est pas testé.");
        }
        System.out.println("une exception va etre generé ici : ");
        if ( (x >= 0) | error.isEmpty() ) {
            System.out.println("on ne rentrera pas ici ?");
        }*/

        if ( (x != 0) && error.isEmpty() ) {

        } else {
            System.out.println("et : la deuxieme condition n est pas testé");
        }
        System.out.println("une exception va etre généré ici");
        if ((x != 1) & error.isEmpty()){

        }

    }
}
