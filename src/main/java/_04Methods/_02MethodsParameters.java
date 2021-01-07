package _04Methods;

public class _02MethodsParameters {

    public static void main(String[] args) {

        toplam(50);
        toplam(100);

        toplam2(0, 50);
        toplam2(50, 60);
        toplam3(0, 10, 2);

    }


    public static void toplam(int max){
        int tpl = 0;
        for (int i=0; i<=max; i++){
            tpl+=i;
        }
        System.out.println(tpl);
    }

    public static void toplam2(int min, int max){
        int tpl = 0;
        for (int i=min; i<=max; i++){
            tpl+=i;
        }
        System.out.println(tpl);
    }

    public static void toplam3(int min, int max, int artim){
        int tpl = 0;
        for (int i=min; i<=max; i+=artim){
            tpl+=i;
        }
        System.out.println(tpl);
    }


}
