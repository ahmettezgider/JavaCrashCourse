package _03Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02Loop2 {


    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,12,34,56};

        ArrayList<Integer> list = new ArrayList<>(List.of(10, 11, 12, 13, 14, 15));


        // forEach
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        list.forEach(System.out::println);

        System.out.println("-------------");
        list.stream().map(n->n*n).forEach(System.out::println);

        System.out.println("-------------");
        list.stream().map(n->n*n).forEach(System.out::println);

        System.out.println("-------------");
        list.stream().map(n->n*n).forEach(a-> System.out.print(a + ", "));

        System.out.println("-------------");
        list.stream().map(n->n*n).filter(n->n%2==0).forEach(a -> System.out.print(a + ". "));


        // lamda    degisken -> islem
        /*
            void yazdir(int a){
                System.out.print(a + ". ");
            }

            a -> System.out.print(a + ". ")

         */

    }


}
