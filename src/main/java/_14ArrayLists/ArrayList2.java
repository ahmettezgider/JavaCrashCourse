package _14ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        listArray(list1);

        ArrayList<Integer> list2 = new ArrayList<>(){
            {
                add(10);
                add(11);
                add(12);
            }
        };
        listArray(list2);


        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(21,22,23,24));
        listArray(list3);

        ArrayList<Integer> list4 = new ArrayList<>(List.of(31,32,33,34,35));
        listArray(list4);

        //LinkedList<Integer> list5 = new LinkedList<>(List.of(31,32,33,34,35));
        //listArray(list5);

    }


    public static void listArray(ArrayList<Integer> list){
        for (Integer val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
