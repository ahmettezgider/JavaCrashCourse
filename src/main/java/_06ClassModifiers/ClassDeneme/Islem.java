package _06ClassModifiers.ClassDeneme;

public class Islem {
    private int i;

    public Islem(int i){
        this.i = i;
    }

    public int sum(int a){
        i+=a;
        return i;
    }
    public int carp(int a){
        i*=a;
        return i;
    }

    public void write(){
        System.out.println(i);
    }

}
