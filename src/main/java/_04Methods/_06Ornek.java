package _04Methods;

public class _06Ornek {

    public static void main(String[] args) {

        System.out.println(asalMi(10));
        System.out.println(asalMi(7));

        asalBul(100);
        asalBul(20);
    }

    public static void asalBul(int max){
        for (int i=2;i<=max; i++){
            if (asalMi(i))
                System.out.print(i + ", ");
        }

    }


    // 2,3,5,7,11,13
    public static boolean asalMi(int x){
        if (x<2)
            return false;
        if (x==2)
            return true;
        for (int i=2; i<x; i++){
            if (x%i==0)
                return false;
        }

        return true;
    }







}
