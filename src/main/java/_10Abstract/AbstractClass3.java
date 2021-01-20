package _10Abstract;


abstract class aClass3 {

    abstract void method1();

}


public class AbstractClass3 {

    public static void main(String[] args) {

        aClass3 ac = new aClass3() {
            @Override
            void method1() {
                System.out.println("method ");
            }
        };

        ac.method1();
    }

    // inner class
    class AA{

    }

}
