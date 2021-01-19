package _09Class.package1;

public class BaseClass {

    public static final String finalStr = "final String";
    public static final int staticVar1;

    public final int insVar1 = 10;
    public final int insVar2;
    public final int insVar3;

    static int staticInt=10;

    static {
        System.out.println("static initializer Base Class");
        staticVar1 = 0;
    }

    {
        System.out.println("instance initializer");
        insVar2 = 5;
    }


    public BaseClass(){
        System.out.println("Base Class Constructor");
        insVar3 = 20;
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

    public final void finalMethod(){
        System.out.println("Base Class final Method");
    }


}
