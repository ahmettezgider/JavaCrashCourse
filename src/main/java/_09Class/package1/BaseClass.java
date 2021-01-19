package _09Class.package1;

public class BaseClass {

    static int a=10;

    static {
        System.out.println("static initializer Base Class");
    }

    {
        System.out.println("instance initializer");
    }


    public BaseClass(){
        System.out.println("Base Class Constructor");
    }

    public void baseClassPublicMethod(){
        System.out.println("baseClassPublicMethod");
    }

    private void baseClassPrivateMethod(){
        System.out.println("baseClassPrivateMethod");
    }

    protected void baseClassProtectedMethod(){
        System.out.println("baseClassProtectedMethod");
    }

    void baseClassDefaultMethod(){
        System.out.println("baseClassDefaultMethod");
    }

    public void method1(){
        System.out.println("Base class Method1");
    }


}
