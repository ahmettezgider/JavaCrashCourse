package _04Methods;

public class _08Recursive {

    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=10;i++){
            sum = sum + i;
            //System.out.println(i + " : " + sum);
        }
        System.out.println(sum);

        System.out.println("-----");
        System.out.println(toplam(10));

    }

    //  1+2+3+4+5+6+....+10
    //  10 + 9 + 8 + ..... 2 + 1
    //  recursivi bitirecek sart
    public static int toplam(int num){
        if (num>0)
            return num + toplam(num-1);  // num + (num-1) + (num-2) + .. + 1 + 0
        else
            return 0;
    }


    /*
        toplam(10) -> return 10 + toplam(9)                     10 + toplam(9)
                                  9 + toplam(8)                 10 + 9 + toplam(8)
                                      8 + toplam(7)             10 + 9 + 8 + toplam(7)
                                          7 + toplam(6)         10 + 9 + 8 + 7 + toplam(6)
                                           ...
                                             2 + toplam(1)
                                                 1 + toplam(0)              10 + 9 + ..... + 2 + 1 + 0 -->
                                                      0
     */


}
