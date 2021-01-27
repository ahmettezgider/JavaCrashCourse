package _14ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(List.of(1,2,3,4,5)));
        list.add(new ArrayList<>(List.of(11,12,13,14,15)));
        list.add(new ArrayList<>(List.of(21,22,23,24,25)));


        System.out.println(list);


        for (ArrayList<Integer> integers : list) {
            System.out.println(integers);
        }


        for (ArrayList<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }


}

/*
        [ [1,2,3,4,5], [11,12,13,14,15], [21,22,23,24,25] ]




 */
