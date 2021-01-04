package _01GirisVariablesFor;


import java.lang.*;  // yazilmasa da default olarak import edilir

public class _MathClass {

    public static void main(String[] args) {

        System.out.println(Math.max(12, 23));

        //Math.max(1, 2, 3);   hatali cünkü max(x,y) seklinde olmali
        System.out.println(Math.max(12, Math.max(2, 3)));


        int s = (int)Math.pow(2,1);     // casting

        int int1 = 1;
        short short1 = (short) int1;
        byte byte1 = (byte) short1;
        byte byte2 = (byte) int1;


        System.out.println(Integer.MIN_VALUE);     // -2 -1 0 1 2
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Double.MIN_VALUE); // 0.00000.....0049    --> 325 tane sifir
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157 X 10^308   E308


        int sayi = Integer.parseInt("2");
    }

}
