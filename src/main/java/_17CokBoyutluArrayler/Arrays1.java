package _17CokBoyutluArrayler;

import java.util.Arrays;
import java.util.Random;

public class Arrays1 {

    public static void main(String[] args) {
        //Random r = new Random();

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = new Random().nextInt(20);
                //arr[i][j] = r.nextInt(20);
            }

        }
        /*
            int[] arr = new int[5];
            {1,2,3,4,5}  1 boyut

            int[][] arr = new int[3][2]
            {
                {1, 2},
                {3, 4},
                {5, 6}
            }
         */

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println("--------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
    }
}
