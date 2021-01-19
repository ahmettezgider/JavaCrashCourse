package _06ClassModifiers.ClassDeneme;

public class Islem2 {
    private int i;

    public static Islem2 IslemStatic(int num){
        return new Islem2(num);
    }

    private Islem2(int i){
        this.i = i;
    }

    public Islem2 sum(int a){
        i+=a;
        return this;
    }
    public Islem2 carp(int a){
        i*=a;
        return this;
    }

    public void write(){
        System.out.println(i);
    }

}
