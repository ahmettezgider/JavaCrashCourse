package _04Methods;

public class _07Recursive {

    public static void main(String[] args) {


        System.out.println(topla(10, 20));
        System.out.println(toplaRecursive(10, 20));
        System.out.println(carpRecursive(1, 5));
    }

    public static int topla(int min, int max){
        int tpl = 0;
        for (int i=min; i<=max; i++){
            tpl+=i;
        }
        return tpl;
    }


    // recursive icin recursive i bitime sarti olmasi lazim
    // 10 11 12 .... 20
    public static int toplaRecursive(int min, int max){
        if (min <= max)
            return min + toplaRecursive(min+1, max);
            //   10 + 11 + 12 + .... + 20
            // 10 + toplaRecursive(11, 20)
            // 10 + 11 + toplaRecursive(12, 20)
            // 10 + 11 + 12 + toplaRecursive(13, 20)
            // 10 + 11 + 12 + .... + 19 + toplaRecursive(20, 20)
            // 10 + 11 + 12 + .... + 19 + 20 + 0

        else
            return 0;
    }

    public static int carpRecursive(int min, int max){
        if (min <= max)
            return min * carpRecursive(min+1, max);
        else
            return 1;
    }
}
