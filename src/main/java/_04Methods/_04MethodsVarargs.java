package _04Methods;

public class _04MethodsVarargs {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};

        System.out.println(toplam(arr));

        System.out.println(toplamVarArgs(1,2,3,4,5));

    }

    // array
    public static int toplam(int[] vars){
        int tpl=0;
        for (int var : vars) {
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


}
