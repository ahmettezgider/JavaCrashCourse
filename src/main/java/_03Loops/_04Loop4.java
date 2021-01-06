package _03Loops;

public class _04Loop4 {

    public static void main(String[] args) {

        /*
                           num = 123   num1=0
                                num    num1   num
                1.  3           123     3      12        123%10 = 3  -->   123/10 = num = 12
                2.  3 2         12      32      1
                3.  3 2 1       1       321     0

         */

        int num = 123;
        int num1 = 0;
        while (num>0){
            num1 = num1*10 + num%10;
            num = num/10;
        }
        System.out.println(num1);

        System.out.println("--------------");
        int strNum = 1230234;
        String str = strNum + "";
        String str1 = "";
        int index = str.length()-1;

        /*
            str     str1
            123     321
         */
        while (str.length() != str1.length()){      // index<0

            str1 += str.substring(index, index+1);
            index--;
        }

        System.out.println(str1);


    }
}
