package _05Class;

public class _01Class1 {
    // fields, attributes, variables
    int instanceVar;            // instance (nesne) variable
    static int classVar = 1;    // class variable




    public static void main(String[] args) {
        int mainMethodVar=1;  // local vars
        System.out.println("Main method");

        System.out.println(classVar);

        _01Class1 cls1 = new _01Class1();
        cls1.instanceVar = 10;
        System.out.println(cls1.instanceVar);
        System.out.println(_01Class1.classVar);

        cls1.classVar = 11;

        _01Class1 cls2 = new _01Class1();
        cls1.instanceVar = 5;
        System.out.println(cls2.instanceVar);
        System.out.println(cls2.classVar);


    }



}
