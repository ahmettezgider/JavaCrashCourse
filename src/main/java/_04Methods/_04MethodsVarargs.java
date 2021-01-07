package _04Methods;

public class _04MethodsVarargs {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};

        System.out.println(toplam(arr));
        //System.out.println(toplam(1,3,5,7,9));
        //System.out.println(toplam());

        System.out.println(toplamVarArgs(1,3,5,7,9));
        System.out.println(toplamVarArgs(arr));
        System.out.println(toplamVarArgs());

        System.out.println(toplam2(3));
        System.out.println(toplam2(3,1,2,3,4));

    }

    // array
    public static int toplam(int[] arr){
        int tpl=0;
        for (int var : arr) {
            tpl+=var;
        }
        return tpl;
    }

    // varargs
    public static int toplamVarArgs(int...vars){
        int tpl=0;
        for (int var : vars) {
            tpl+=var;
        }
        return tpl;
    }

    // varargs
    public static int toplam2(int a, int...vars){
        int tpl=a;
        for (int var : vars) {
            tpl+=var;
        }
        return tpl;
    }
}
