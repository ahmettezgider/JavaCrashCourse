package _09Class.package1;

public class publicClass1 extends BaseClass{

    static {
        System.out.println("static initializer publicClass1");
        System.out.println(a);
    }

    public static void main(String[] args) {

        publicClass1 pc = new publicClass1();
        pc.baseClassPublicMethod();
        pc.baseClassProtectedMethod();
        pc.baseClassDefaultMethod();
        pc.method1();
        System.out.println(pc);
    }
}
