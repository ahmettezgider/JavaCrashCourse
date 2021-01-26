package _14ArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayList3 {

    int a;
    {
        a = new Random().nextInt(100);
    }

    public ArrayList3(){

        a *=100;
    }

    public static void main(String[] args) {

        List list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        listArray(list1);

        List list2 = new LinkedList<Integer>();
        list2.add(10);
        list2.add(11);
        listArray(list2);


        List list3 = new LinkedList<String>();
        list3.add("string");
        listArray(list3);

        List list4 = new ArrayList<ArrayList3>();
        list4.add(new ArrayList3());
        list4.add(new ArrayList3());
        listArray(list4);

    }

    public static void listArray(List list){
        for (Object val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ArrayList3{a = " + a + "}";
    }
}
