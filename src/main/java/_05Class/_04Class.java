package _05Class;

import java.util.Random;

public class _04Class {


    public static void main(String[] args) {

        _04Class cls = new _04Class();
        System.out.println(cls.rnd());

        System.out.println(new _04Class().rnd1());

        int sayi = new _04Class().rnd();
        System.out.println(sayi);

        System.out.println(rnd2());

    }


    public int rnd(){
        return new Random().nextInt(100);
    }

    public int rnd1(){
        Random r = new Random();
        int a = r.nextInt(100);
        return a;
    }

    public static int rnd2(){
        return 10;
    }

}
