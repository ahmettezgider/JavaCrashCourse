package _15Sets;

import java.util.*;

public class Sets2 {

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(List.of(10000, 1,2,100, 1233, 1000));
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(List.of(10000, 1,2,100, 1233, 1000));
        TreeSet<Integer> set3 = new TreeSet<>(List.of(10000, 1,2,100, 1233, 1000));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        for (Integer integer : set1) {
            System.out.print(integer + ", ");
        }

        System.out.println();
        Iterator<Integer> it = set1.iterator();

        while (it.hasNext())
            System.out.print(it.next() + ". ");




    }

}
