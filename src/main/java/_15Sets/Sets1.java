package _15Sets;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sets1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(2,2,1,1,2,3,3,4,5,6));

        HashSet<Integer> set = new HashSet<>(List.of(2,2,1,1,2,3,3,4,5,6));

        System.out.println(list);
        System.out.println(set);

        list.get(3);





    }

}


/*
    Setlerin elemanlari unique (tek) dir. Mükerrer eleman olmaz

    HashSet         : kendine göre siralama yapar
    LinkedHashSet   : girilen siraya göre kayit tutar
    TreeSet         : elemanlari siralar



 */
