package _17CokBoyutluArrayler;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists2 {

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

        System.out.println(l1);
        System.out.println(list);


        /*
            [
                [67, 35, 89],
                [67, 89],
                [67],
                [57, 75, 81, 93]
            ]
         */

        System.out.println("-----------------------");
        for (ArrayList<Integer> innerList : list) {
            int sum = 0;
            int count = 0;
            for (Integer val : innerList) {
                sum += val;
                count++;
            }
            System.out.printf("%-20sOrt: %.2f\n", innerList, (double)sum/count);
        }



    }
}
