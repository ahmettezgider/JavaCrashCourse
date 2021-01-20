package _10Abstract.paket1;

public class Circle extends shape{

    @Override
    public int alan() {
        return 0;
    }

    @Override
    public int cevre() {
        return 0;
    }

    public void ekMethod(){
        System.out.println("Extra method");
    }

    @Override
    public void length(){
        System.out.println("length bu class");
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.alan());
        System.out.println(c.cevre());
        c.length();
        c.ekMethod();
        System.out.println(c.a);

    }

}
