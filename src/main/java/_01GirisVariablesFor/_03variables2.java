package _01GirisVariablesFor;

import java.util.Locale;

public class _03variables2 {


    public static void main(String[] args) {
        /*
            primitive variables : byte, short, char, int, long, float, double, boolean
                                {String}
            non primitive variables : String, Arrays, Class

            Java pure Object Oriented bir dil degildir. primitive variables dan dolayi

            java primitive vars --> variable havuzunda
            int, Integer
            ArrayList<Integer> list = new ArrayList<>();
         */

        int a = 5;
        // String immutable dir . Degismez variable, yeni atama icin RAM de yeni yer acar
        String str = "Hello";   // immutable, mutable       //   RAM de Hello --> yer acilir  --> id: X01C

        str = str + " World";                               //   RAM de yeni bir Hello World yeri acilir id:X03D


        System.out.println(str);
        System.out.println(str.substring(2,5));
        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();                        //   RAM de yeni bir HELLO WORLD yeri acilir  id : X06N
        System.out.println(str);

    }




}
