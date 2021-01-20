package _11Interface;

interface Int1{
    void A();
    void B();
}


interface Int2 extends Int1{

    void C();
    void D();
}


class ClassC implements Int2{
    @Override
    public void A() {

    }

    @Override
    public void B() {

    }

    @Override
    public void C() {

    }

    @Override
    public void D() {

    }
}


public class ClassB extends ClassC{


}
