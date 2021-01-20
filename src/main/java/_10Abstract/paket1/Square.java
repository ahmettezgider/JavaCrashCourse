package _10Abstract.paket1;

public class Square extends shape{
    @Override
    public int alan() {
        return 0;
    }

    @Override
    public int cevre() {
        return 0;
    }

    public static void main(String[] args) {
        Square c = new Square();
        System.out.println(c.alan());
        System.out.println(c.cevre());
        c.length();
        System.out.println(c.a);

    }
}
