package _03Loops;

public class _05Logic {

    public static void main(String[] args) {

        /*
            &&  -> and      shortcut
            ||  -> or       shortcut

            &   -> bitwise and
            |   -> bitwise or

            && ve &  islemleri ve sonuclari ayni
            || ve |  islemleri ve sonuclari ayni

         */


        int i = 10;
        int j = 20;

        if (i++ > 5 || j-- < 30){   // sart saglaniyorsa ikinci kondition okunmaz
            System.out.println(i + " , " + j);
        }

        i = 10;
        j = 20;
        if (i++ > 5 | j-- < 30){            // her iki kondition okunur
            System.out.println(i + " , " + j);
        }
    }
}
