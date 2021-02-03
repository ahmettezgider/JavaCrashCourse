package _17CokBoyutluArrayler;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists3 {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>(List.of(67, 35, 89));
        ArrayList<Integer> l2 = new ArrayList<>(List.of(67, 89));
        ArrayList<Integer> l3 = new ArrayList<>(List.of(67));
        ArrayList<Integer> l4 = new ArrayList<>(List.of(57, 75, 81, 93));

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        for (int i = 0; i < list.size(); i++) {
            //if (i%2==0) continue;

            for (int j = 0; j < list.get(i).size(); j++) {
                //list.get(i).set(j, list.get(i).get(j) * 2);
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        for (ArrayList<Integer> innerList : list) {
            for (Integer val : innerList) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        /*
            list.get(1).set(1, 10);
            list.set(index, val);


         */

    }
}


