package _11Interface;

interface interface1 {
    int a=2;
    String interface1Var = "interface1";

    // normal methodlar abstract tir. Gövdesi yoktur
    void method1();

    // default method interface lere java 8 ile geldi
    default void method2(){
        System.out.println("interface method");
    }


    default void method3(){
        System.out.println("interface default method 3");
    }
}
