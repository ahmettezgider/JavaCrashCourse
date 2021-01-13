package _06ClassModifiers;

import java.util.Random;

public class _02PrivateConstructor {

    public static void main(String[] args) {

        //AClass ac = new AClass();
        //System.out.println(ac.getI());

        AClass a = AClass.$(1000);
        System.out.println(a.getI());

        AClass.$(100).write();
    }

}


class AClass{

    private int i;

    public static AClass $(int num){
        return new AClass(num);
    }

    private AClass(int num){
        i = new Random().nextInt(num);
    }

    public int getI(){
        return i;
    }
    public void write(){
        System.out.println(i);
    }
}
