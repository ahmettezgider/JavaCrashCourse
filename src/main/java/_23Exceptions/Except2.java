package _23Exceptions;

public class Except2 {

    public static void main(String[] args) {

        Ex2();

    }


    public static void Ex1(){
        try {
            Thread.sleep(100);
            int a = 10/0;                   // Exception verecek cünkü AritmethicException catch icinde yok
        } catch (InterruptedException e) {
            System.out.println("hata");
        }
        System.out.println("Devam");
    }

    public static void Ex2(){
        try {
            Thread.sleep(100);
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Hata : " + e.getMessage());
        }
        System.out.println("Devam");
    }

    public static void Ex3(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void Ex4(){
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        //} catch (InterruptedException e) {        // Compile hatasi verir, cünkü ilk sirada genel Exception var
        //    e.printStackTrace();
        }

    }
}
