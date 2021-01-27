package _14ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Lists2 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(2,3,5,10));

        list1.add(7);
        list1.add(2, 12);

        System.out.println(list1);


        ArrayList<Integer> list3 = new ArrayList<>();

        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);

        ArrayList<String> list4 = new ArrayList<>(List.of("a", "b", "c", "d"));
        list4.remove(0);
        list4.remove("b");
        System.out.println(list4);

        //list1.remove(12);                 index = 12
        //list1.remove(list1.indexOf(12));  12'nin indexi bulunuyor

        list1.remove(new Integer(12));  // 12 obje olarak tanimlaniyor


        System.out.println(list1);


        list1.retainAll(list2);
        System.out.println(list1);

        System.out.println(list1.remove(1));

    }
}
