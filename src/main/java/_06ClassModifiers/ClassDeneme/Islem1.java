package _06ClassModifiers.ClassDeneme;

public class Islem1 extends Islem11{
    private int i;

    public Islem1(int i){
        this.i = i;
    }

    public Islem1 sum(int a){
        i+=a;
        return this;
    }
    public Islem1 carp(int a){
        i*=a;
        return this;
    }

    public void write(){
        System.out.println(i);
    }

}

class Islem11{

      public void bol(int a){
          System.out.println("ok");
      }
}