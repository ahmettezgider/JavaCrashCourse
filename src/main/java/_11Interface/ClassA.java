package _11Interface;

public class ClassA extends BaseClass implements interface1, interface2{
    @Override
    public void method1() {
        System.out.println("Class A override method, interface1");
    }

    @Override
    public void method11() {
        System.out.println("Class A override method11, interface2");
    }

    public static void main(String[] args) {
        ClassA c = new ClassA();
        c.method1();        // abstract method
        c.method2();        // default method
        c.method3();        // default method
        c.method11();
        c.method12();
        System.out.println(c.name);     // Baseclass
        System.out.println(interface1Var);
        //interface1Var = "asasas";

    }


}
