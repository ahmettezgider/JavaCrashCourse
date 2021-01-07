package _04Methods;

public class _01Methods1 {

    public static void main(String[] args) {

        /*
        int toplam1 = 0;
        for (int i=0; i<=50; i++){
            toplam1+=i;
        }
        System.out.println(toplam1);

         */

        toplam();

    }

    // 0-100 arasi sayilari toplar ve ekrana yazdirir
    public static void toplam(){
        int tpl = 0;
        for (int i=0; i<=100; i++){
            tpl+=i;
        }
        System.out.println(tpl);
    }




    /*

        [public|private|] [static|final] [void|int|Object|...] name(parameters){
        }


     */


}
