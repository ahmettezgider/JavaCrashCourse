package _14ArrayLists;

import java.util.Random;

public class ClassA {

    public int getRandomNum(int start, int end){
        /*
            .nextInt(10); --> [0, 10)
            random(10, 20) -->
            random(a, b)  ->  a + .nextInt(b-a)

         */

        int num;
        Random r = new Random();
        num = start + r.nextInt(end-start);
        return num;
    }

    public void writeVal(String val){
        System.out.println("Instance Method : " + val);
    }

    public static void writeVal1(String val){
        System.out.println("Static Method : " + val);
    }

    public static void main(String[] args) {

        ClassA ca = new ClassA();
        System.out.println(ca.getRandomNum(10, 20));
        System.out.println(new ClassA().getRandomNum(10, 20));


        System.out.println(new Random().nextInt(100));

        new ClassA().writeVal("Java");
        ClassA.writeVal1("Java");

    }


}
