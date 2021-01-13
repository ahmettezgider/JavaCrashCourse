package _05Class;

public class _02Class {
    // fields, attributes, variables
    int instanceVar;            // instance (nesne) variable
    static int classVar = 1;    // class variable



    // statik initializer, class ilk calistirildiginda 1 sefer calisir
    static {
        System.out.println("Parent Static initializer calisti, classVar: " + classVar);
    }

    // instance initializer, nesne olusturuldugunda constructordan hemen önce calisir
    {
        System.out.println("Parent Instance initializer calisti, instanceVar: " + instanceVar);
    }

    // constructor, nesneye aittir, nesne olusturuldugunda calisir
    public _02Class(){
        System.out.println("Parent Constructor calisti");
    }

    public void instanceMethod(){
        System.out.println("Parent Instance method calisti");
    }


    public static void main(String[] args) {

        System.out.println("Parent Main method'a giris yapildi");

        System.out.println("Parent cls1 nesnesi olusturlmadan önce");
        _02Class cls1 = new _02Class();
        System.out.println("Parent cls1 nesnesi olusturulduktan sonra");

        System.out.println("Parent cls2 nesnesi olusturlmadan önce");
        _02Class cls2 = new _02Class();
        System.out.println("Parent cls2 nesnesi olusturulduktan sonra");

        System.out.println("Parent Main methodun sonu");
    }



}
