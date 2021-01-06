package _03Loops;

import java.util.Scanner;

public class _03Loop3 {

    public static void main(String[] args) {
        /*
          // sonsuz loop

        while (true){
           // sarta bagli olarak loop a hic girilmeyebilir
        }


        do{
            // en az 1 sefer loop a girilir

        }while(condition)

         */

        Scanner sc = new Scanner(System.in);
        int num;
        /*
        do{
            System.out.print("Bir sayi giriniz : ");
            num = sc.nextInt();
        }while (num != 0);
    */

        num=1;
        while (num != 0){
            System.out.print("Bir sayi giriniz : ");
            num = sc.nextInt();
        }
    }


}
