package _02ArraysLoops;

import java.util.Arrays;

public class _02ForLoop {



    public static void main(String[] args) {

        int[] arr = new int[]{10,11,12};

        System.out.println("length : " + arr.length);

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        for (int i=0;i<3;){
            System.out.print(arr[i] + " - ");
            i++;
        }

        System.out.println();
        int j = 0;
        for (;j<3;){
            System.out.print(arr[j] + " _ ");
            j++;
        }

       /*
        for ( ; ; ) {
            // infinite loop, sonsuz loop
        }
        */


        System.out.println("---------------------------------");

        int[][] arr2dim = new int[3][3];

        arr2dim[0][0] = 1;
        arr2dim[0][1] = 2;
        arr2dim[0][2] = 3;
        arr2dim[1][0] = 4;
        arr2dim[1][1] = 5;
        arr2dim[2][0] = 6;

        for (int i = 0; i < arr2dim.length; i++) {

            for (int i1 = 0; i1 < arr2dim[i].length; i1++) {
                System.out.print(arr2dim[i][i1] + ", ");
            }
            System.out.println();


        }

        System.out.println();
        System.out.println("-------------------");
        int[][] arr3dim = {
                {1,2,3},            //  1   2   3       new int[3]
                {4,5},              //  4   5           new int[2]
                {6}                 //  6               new int[1]
        };

        arr3dim[2][0] = 7;
        //arr3dim[2][1] = 8;


        for (int i = 0; i < arr3dim.length; i++) {

            for (int i1 = 0; i1 < arr3dim[i].length; i1++) {
                System.out.print(arr3dim[i][i1] + " - ");
            }
            System.out.println();

        }

        System.out.println();
        int[][] arr4dim = {
                {1,2,3},            //  1   2   3       new int[3]
                {4,5},              //  4   5           new int[2]
                {6}                 //  6               new int[1]
        };

        for (int i = 0; i < 3; i++) {
            for (int i1 = 0; i1 < 3; i1++) {

                System.out.print(arr4dim[i][i1] + " - ");
                if (i1 >= arr4dim[i].length-1)
                    break;
            }
            System.out.println();

        }

    }

}
