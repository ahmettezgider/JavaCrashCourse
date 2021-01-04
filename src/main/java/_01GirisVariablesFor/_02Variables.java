package _01GirisVariablesFor;

public class _02Variables {

    // variable isimlendirmesi, zorunlu degil
    // package isimleri : kücük harfle yazilir
    // Class  isimleri : Büyük harfle baslar, CamelStyle
    // method isimleri : kücükharfle baslar, CamelStyle  -> methodIsmi();
    // degisken isimleri: kücükharfle baslar, CamelStyle -> variableName;

    static String str;


    static {
        String str1 = "str1";
        str = "string";
    }

    public static int i=3;

    // statikler --> statikler
    // nesneler  --> statik ve instance (nesne)

    // main methode, java programinin baslama metodu
    public static void main(String[] args) {
        int b = 2;
        System.out.println("Hello");
        System.out.println(i);
        System.out.println(b);
        System.out.println(str);
    }

    public static void yazdir(){
        System.out.println(i);

        for (int j = 0; j < 10; j++) {
            System.out.print(j + ", ");

        }

        //System.out.println(j);  j bu alanda tanimli degil

        //System.out.println(b); b bu alanda tanimsiz
    }


}
