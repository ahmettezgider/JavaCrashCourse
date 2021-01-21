package _11Interface.paket1;

interface A{
    int a = 10;
    void a();
    void b();
    void c();
}

abstract class AClass implements A{

    public void a(){
        System.out.println("a");
    }

    public void b(){
        System.out.println("b");
    }

    //public abstract void d();
}

public class ClassA extends AClass{

    public void a(){
        System.out.println("aaa");
    }


    public void c(){
        System.out.println("c");
    }

    public static void main(String[] args) {
        ClassA ca = new ClassA();
        ca.a();
        ca.b();
        ca.c();
    }

}
