package fr.eql.ai111.algo.init.demo;

public class _2_DemoVariables {

    public static void main(String[] args) {

        System.out.println("*** Déclaration et affectation ***");
        int number1;
        number1 = 0;
        System.out.println(number1);
        number1 = 42;
        System.out.println(number1);
        int number2 = 257;
        System.out.println(number2);
        number2 = 1000;
        System.out.println(number2);
///////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\r\n*** Les nombres ***");
        /*
        -byte- : entier court qui est codé sur un octet ( -128 à 127)
        -short- : entier court codé sur 2 octets (-32768 à 32767)
        -int- : entier codé sur 4 octets (-2*10^9 à 2*10^9)
        -long- : entier longs codé sur 8 octets (-9*10^18 à 9*10^18)
                un long doit etre suffixé avec un L
        -float- : réel (nombre à virgule flottante) codé sur 4 octets
                un float doit etre suffixé par un f.
         -double- réel (nombre à virgule flottante) codé sur 8 octets
                un float doit etre suffixé par un d.
         */

        byte temperature = 42;
        short speed = 32000;
        int distance = 43000;
        long lightyear = 99765430000000L;
        float pi = 3.1465899f;
        double third = 0.333333333333d;
        //distance = 0b111;
        System.out.println(temperature);
        System.out.println(distance);
        System.out.println(speed);
        System.out.println(lightyear);
        //System.out.print(pi+ "  " + temperature);

/////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\r\n*** les booléens ***");
        // un booléen est stocké sur 1 octet.
        boolean isReady = true;
        System.out.println(isReady);
        isReady = false;
        System.out.println(isReady);

        System.out.println("\r\n*** les caractères ***");

        //  Un caractère s'écrit par convention entre '' et est sotcké sur 2 octets
        char letter = 'a';
        System.out.println(letter);

//////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\r\n*** les chaines de caractère. ***");
        //3 façones de décaler une chaîne de caractère.
        String sentence1 = "Some words";
        System.out.println(sentence1);
        String sentence2 = new String();
        sentence2 = "other words";
        System.out.println(sentence2);
        String sentence3 = new String("Final words");
        System.out.println(sentence3);

 //////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\r\n*** la concaténation des chaînes de caractère. ***");

        String bigSentence = sentence1 + " " + sentence2 + " " + sentence3 ;
        System.out.println(bigSentence);

////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("\r\n*** Impression d'un caractère d'une chaines de caractères. ***");
        System.out.println(bigSentence.charAt(1));


        System.out.println("\r\n*** Comparaison entre  deux chaînes de caractère. ***");
        System.out.println(sentence1.equals(sentence2));
        System.out.println(!sentence1.equals(sentence2));

    }
}
