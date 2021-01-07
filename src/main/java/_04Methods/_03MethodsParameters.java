package _04Methods;

public class _03MethodsParameters {

    public static void main(String[] args) {

        System.out.println(toplam(10));

        int a = toplam(10);
        System.out.println(a + toplam(5));

    }

    // return types
    public static int toplam(int max){
        int tpl = 0;
        for (int i=0; i<=max; i++){
            tpl+=i;
        }
        return tpl;
    }



}
