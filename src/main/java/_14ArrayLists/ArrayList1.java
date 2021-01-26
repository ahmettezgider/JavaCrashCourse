package _14ArrayLists;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        for (int value : list1) {
            System.out.println(value);
        }



    }

}


/*
    Collections
    List --> ArrayList, LinkedList, [Vector, Queu, ]
    Set  --> HashSet, LinkedHashSet, TreeSet


    wrapperclass
    int --> Integer
    double --> Double
    ....


    Generic      ArrayList<String>, ArrayList<Integer>

 */