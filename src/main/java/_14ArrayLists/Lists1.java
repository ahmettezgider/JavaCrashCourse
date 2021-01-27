package _14ArrayLists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists1 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(List.of(1,2,3,5,6,7,23,12,45));

        for (Integer integer : list1) {
            System.out.print(integer + ", ");
        }

        System.out.println();

        Collections.sort(list1, Collections.reverseOrder());

        Iterator<Integer> it = list1.iterator();


        while (it.hasNext())
            System.out.print(it.next() + ", ");

        System.out.println();
        System.out.println(Collections.max(list1));


        Collections.addAll(list1, 100, 101, 102);

        System.out.println(list1);

    }


}
