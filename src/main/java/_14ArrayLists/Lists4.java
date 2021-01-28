package _14ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists4 {

    public static void main(String[] args) {
        String str = "java";

        System.out.println(str.indexOf('x'));
        System.out.println(str.indexOf('v'));


        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,5,9,20,12,6));

        //list1.sort(Integer::compareTo);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list1.indexOf(9));
        System.out.println(list1.indexOf(10));

        System.out.println(Collections.binarySearch(list1, 9));
        System.out.println(Collections.binarySearch(list1, 10));

        System.out.println(Collections.binarySearch(list1, 1));
        System.out.println(Collections.binarySearch(list1, 0));

        System.out.println(Collections.binarySearch(list1, 6));




    }
}
