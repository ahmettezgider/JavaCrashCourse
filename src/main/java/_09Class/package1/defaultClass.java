package _09Class.package1;

import java.util.Arrays;

class defaultClass extends BaseClass{
    String name = "name";
    public final int[] finalArr = {1,2,3,4,5};

    public static void main(String[] args) {
        defaultClass cls = new defaultClass();

        cls.method1();
        System.out.println(cls);

        // finalStr = "qwe";  final oldugundan yeni tanimlama yapilamaz
        staticInt = 20;
        System.out.println(Arrays.toString(cls.finalArr));
        // cls.finalArr = new int[]{1,2,3};  final oldugundan yeni tanimlama yapilamaz
        cls.finalArr[0] = 10;
        System.out.println(Arrays.toString(cls.finalArr));


    }




    @Override
    public void method1(){
        System.out.println("Bu Class'in Method1");
    }

    /*  final methodlar override edilemezler
    @Override
    public final void finalMethod(){
        System.out.println("Base Class final Method");
    }

     */

    @Override
    public String toString() {
        return "defaultClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
