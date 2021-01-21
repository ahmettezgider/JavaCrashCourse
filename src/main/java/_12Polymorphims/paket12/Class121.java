package _12Polymorphims.paket12;


/*
            BaseClass1
       Class121     Class122


               List
      ArrayList   LinkedList

 */


import java.util.ArrayList;
import java.util.List;

abstract class BaseClass1{
    int a = 10;

    void A(){
        System.out.println("A");
    }
}


class Class122 extends BaseClass1{
    int c = 1;
    void C(){
        System.out.println("C");
    }
}

public class Class121 extends BaseClass1{
    int b = 20;

    void A(){
        System.out.println("AA");
    }

    void A(int b){

    }


    void B(){
        System.out.println("B");
    }


    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();

        Class121 c1 = new Class121();
        c1.A();


        BaseClass1 c2 = new Class121();
        c2.A();

        BaseClass1 c3 = new Class122();

        //c1.yy(c2);
        c1.xx(c2);
        c1.xx(c1);
        c1.xx(c3);

    }



    public void xx(BaseClass1 bc){      // Clas121, Class122

    }


    public void yy(Class121 bc){        // Class121

    }

}
