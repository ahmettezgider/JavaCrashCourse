package _14ArrayLists;

import java.util.*;

public class Lists3 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,5,9,20,5,6));


        //list1.forEach(System.out::println);
        list1.forEach(Lists3::printX);


        System.out.println();
        list1.forEach(n -> {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        });


        System.out.println();
        list1.forEach(n -> printX(n*n));

        System.out.println();

        list1.forEach(Lists3::methodA);
        System.out.println();
        list1.forEach(n -> methodA(n*n));
    }

    public static void printX(int a){
        System.out.print(a*2 + ", ");
    }

    public static void methodA(int a){
        System.out.print(Math.sqrt(a) + ", ");
    }


}
