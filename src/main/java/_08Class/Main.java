package _08Class;

public class Main {


    public static void main(String[] args) {

        Person ali = new Person("Ali", 20);
        Person baba = new Person("Baba", 50);
        Person anne = new Person("Anne", 45);
        Person dede = new Person("Dede", 80);
        Person nine = new Person("Nine", 78);

        ali.setBaba(baba);
        ali.setAnne(anne);
        baba.setBaba(dede);
        anne.setAnne(nine);
        baba.setEs(anne);

        System.out.println(ali.getBaba().getBaba().getName());





        System.out.println(ali.getName());





    }


}
