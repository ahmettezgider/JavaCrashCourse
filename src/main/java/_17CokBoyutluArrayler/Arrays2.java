package _17CokBoyutluArrayler;

import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {10, 12, 13}, {21}, {32, 35, 38, 39}};
        /*
            {
                {1, 2, 3, 4},       // arr[0]
                {10, 12, 13},       // arr[1]
                {21},               // arr[2]
                {32, 35, 38, 39}    // arr[3]
             }

         */


        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("-------------------");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(i + ", " + j + " - " + arr[i][j]);
            }
        }


        System.out.println("-------------");
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }


        System.out.println("-------------");
        for (int[] ints : arr) {
            Arrays.stream(ints).forEach(n -> System.out.print(n + "\t"));
            System.out.println();
        }

    }
}
