package _03Loops;

import java.util.ArrayList;
import java.util.Arrays;

public class _01Loop1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,12,34,56};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            arr[i] = arr[i]*10;
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

        /* enhanced for

             for (Type eleman: iterable){

           }

         */

        for (int i : arr) {
            System.out.print(i + " - ");
        }


        System.out.println("--------------------");
        int[][] arr2dim = {
                {1,2,3},            //  1   2   3       new int[3]
                {4,5},              //  4   5           new int[2]
                {6}                 //  6               new int[1]
        };


        for (int[] ints : arr2dim) {

            for (int anInt : ints) {
                System.out.print(anInt*2 + ", ");
            }
            System.out.println();

        }

    }

}

/*
class Insan{
    String name;
    int age;

    ArrayList<Insan> list;

    public void mtd(){
        for (Insan insan : list) {
            System.out.println(insan.name);
        }
    }

}

 */