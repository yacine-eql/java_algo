package fr.eql.ai111.algo.init.demo;

public class _3_DemoArithmetic {

    public static void main(String[] args) {
        int numbre1, numbre2, result1;
        float numbre3, numbre4, result2;

        numbre1 = 7;
        numbre2 = 2;
        System.out.println("*** Addition ***");
        result1 = numbre1 + numbre2;
        System.out.println(numbre1 + " + " + numbre2 + " = " + result1);

        result1 = result1 + 1;
        result1 += 1;
        result1++;
        ++result1;
        System.out.println(result1);

/////////////////////////////////////////////////////////////////////////////////////////////////////:

        System.out.println("*** Soustraction ***");
        result1 = numbre1 - numbre2;
        System.out.println(result1);
        result1--;
        System.out.println(result1);

 ///////////////////////////////////////////////////////////////////////////////////////////////////////////:

        System.out.println("*** Multiplication ***");
        result1 = numbre1 * numbre2;
        System.out.println(result1);
        result1 *= numbre2;
        System.out.println(result1);
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("*** Division ***");
        numbre3 = 7f;
        numbre4 = 2f;
        result2 = numbre3 / numbre4;
        System.out.println(result2);
        result2 /=numbre4;
        System.out.println(result2);

        /*
        Division euclidienne (entrière)
        7/2 = 3.5
        7/2 = 3 + 0.5
        7 = (3 + 0.5) * 2
        7 = 3 * 2 + 0.5 * 2
        7 = 2 * 3 + 1
        7 : dividente  2 : diviseur  3 : quotient     1  : reste
         */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("*** quotient d'une division entiere ***");

        result1 = numbre1 / numbre2;
        System.out.println(result1);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("*** reste d'une division entiere modulo ***");
        result1 = numbre1 % numbre2;
        System.out.println(result1);
        System.out.println(numbre1 + "modulo" + numbre2 + " = " + result1);

    }
}