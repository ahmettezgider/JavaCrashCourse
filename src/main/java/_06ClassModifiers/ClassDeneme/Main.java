package _06ClassModifiers.ClassDeneme;

import static _06ClassModifiers.ClassDeneme.Islem2.*;

public class Main {

    public static void main(String[] args) {

        Islem isl = new Islem(1);
        isl.sum(5);
        isl.sum(2);
        isl.carp(10);
        isl.write();

        System.out.println("--------------------------");

        Islem1 isl1 = new Islem1(1);
        isl1.sum(5).sum(2).carp(10).write();

        System.out.println("--------------------------");
        //Islem2 isl2 = new Islem2();  -> Hata verir
        Islem2 isl2 = IslemStatic(1);
        isl2.sum(2).carp(10).write();

        IslemStatic(1).sum(2).carp(10).write();
        IslemStatic(1)
                .sum(3)
                .sum(10)
                .carp(2)
                .carp(2)
                .write();


    }

}
