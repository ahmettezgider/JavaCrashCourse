package _07Class;

public class Main {


    public static void main(String[] args) {

        /*
            Ali
                Baba
                    Dede
                Anne
         */

        Person pAli = new Person();
        pAli.age = 20;
        pAli.name = "Ali";
        //pAli.baba.age= 50;


        Person pBaba = new Person();
        pBaba.name = "Baba1";
        pBaba.age = 50;

        Person pAnne = new Person();
        pAnne.name = "Anne";
        pAnne.age = 45;

        pAli.baba = pBaba;
        pAli.anne = pAnne;

        System.out.println(pAli.baba.name);
        System.out.println(pAli.anne.age);

        System.out.println(pAli);
        System.out.println(pBaba);

        pBaba.es = pAnne;
        pAnne.es = pBaba;

        Person pDede = new Person();
        pDede.name = "Dede";
        pDede.age = 80;

        pBaba.baba = pDede;

        System.out.println("--------------");
        System.out.println(pAli.baba.baba.name);
        System.out.println(pBaba.baba.name);


        System.out.println(pAli.baba.es.name);
        System.out.println(pAli.anne.es.baba.name);

        //System.out.println(pAli.baba.baba.baba.baba.baba.baba.baba.anne.anne.es.baba.name);

    }


}
