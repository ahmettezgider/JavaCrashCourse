package _04Methods;

public class _05MethodsOverload {

    public static void main(String[] args) {

        System.out.println(toplam1(1,2));
        System.out.println(toplam1(1.3, 3));
        System.out.println(toplam1(1, 3.2));
        System.out.println(toplam1(1.5, 3.2));
        System.out.println(toplam1(1,2, 5));
    }


    public static int toplam1(int a, int b){
        return a+b;
    }

    /*
    public static double toplam1(int a, int b){
        return a+b*2;
    }
     */


    public static double toplam1(double a, int b){
        return a+b*3;
    }

    public static double toplam1(int a, double b){
        return a+b*10;
    }

    public static float toplam1(double a, double b){
        return (float) (a+b);
    }

    public static String toplam1(int a, int b, int c){
        return (a+b+c) + "";
    }
}
