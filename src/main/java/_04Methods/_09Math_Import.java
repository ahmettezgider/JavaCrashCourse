package _04Methods;


import java.util.Random;        // java.util in altindaki sadece Random classi import edilmis
import java.util.*;             // java.util in altindaki tüm classlar import edilmis

import static _04Methods._04MethodsVarargs.*;  // bu class daki tüm statik methodlar
import static _04Methods._04MethodsVarargs.toplamVarArgs;   // bu class altindaki belirli bir method

//import java.lang.*;       // default yüklenen package

public class _09Math_Import {

    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random() + ", " + 10*Math.random());
            //
        }


        System.out.println("--------------------------");
        System.out.println(Math.random());
        System.out.println(10*Math.random());
        System.out.println((int)(10*Math.random()));
        System.out.println(1 + (int)(10*Math.random()));
        */

        for (int i = 0; i < 10; i++) {
            double rnd = 10*Math.random();

            System.out.println(rnd + ", floor : " +
                    Math.floor(rnd) + ", ceil:" +
                    Math.ceil(rnd) + ", round : " + Math.round(rnd));
        }

        System.out.println("Random");
        Random r = new Random();
        r.setSeed(120);
        for (int i = 0; i < 10; i++) {
            System.out.print(r.nextInt(100) + ", ");
        }


        // import
        System.out.println(_04MethodsVarargs.toplamVarArgs(1,2,3,4));
        System.out.println(toplamVarArgs(1,2,3,4));

    }




}


/*      Math.random(),     [0, 1)  -> 0 dahil, 1 haric
        [0, 1) * 10 -> [0, 10)
        1 + 10*[0, 1) - > 1 + [0, 10) -> (int)[1, 11)


        [0, 1)    -> [10, 20)   -> min=10, max=20
        (20-10)*[0, 1) + 10 -> [0, 10) + 10 -> [10, 20)
        (max - min)*[0, 1) + min
        (int)(min + (max-min)*Math.random())

 */