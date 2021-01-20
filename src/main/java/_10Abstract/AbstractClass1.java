package _10Abstract;

// abstract class, method

abstract class aClass {

    public int a=10;

    public void print1(){
        System.out.println("Abstract class print method");
    }

    abstract void abstrackPrint();

}


class AbstractClass2 extends aClass{

    void abstrackPrint(){
        System.out.println("Hello wold");
    }

}



public class AbstractClass1 extends aClass{

    public static void main(String[] args) {

        AbstractClass1 ac = new AbstractClass1();
        ac.print1();
        ac.abstrackPrint();

    }

    @Override
    void abstrackPrint() {
        System.out.println("Yeni Print methodu");
    }
}
