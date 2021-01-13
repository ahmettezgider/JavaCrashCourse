package _06ClassModifiers;

import java.util.Arrays;

public class _01FinalClass extends ParentClassB{

    final static int a = 5;
    final static int[] arr = {1,2,3};


    public static void main(String[] args) {
        // final oldugu icin yeni atama yapilamaz
        //a = 10;

        // final da olsa o attibute ait methodlar yürütülür
        // amac ayni isimle yeni atama yapilamamasi
        System.out.println(Arrays.toString(arr));
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));

    }

    // Override Parent class"a methodlarin ayi isimle child classda tekrar yazilmasi
    @Override
    public void method1(){
        System.out.println("child methodu");
    }

    /*  Parent daki bu isimli method final oldugu icin Override edilemez
    public void methodFinal(){

    }
    */

}

class ParentClassB {
    public void method1(){
        System.out.println("parent methodu");
    }
    public final void methodFinal(){
        System.out.println("parent final methodu");
    }

}

// final classlar extend edilemez
final class ParentClassA {

}


abstract class abstractClass{

    public abstract void absMethod();

    public void normalMethod(){
        System.out.println("normal method");
    }
}