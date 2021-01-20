package _11Interface;

interface Int11{
    int a = 10;
    void A();
    void B();

}

abstract class ClassD2{
    int b = 10;
    abstract void C();
}

class ClassD1 extends ClassD2 implements Int11{

    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

    @Override
    public void C() {

    }
}



public class ClassD extends ClassD1{

    public static void main(String[] args) {
        ClassD d = new ClassD();
        d.A();
        d.B();
        d.C();
        d.b = 30;

    }
}
