package _08Class;

public class Main1 {


    public static void main(String[] args) {

        Person baba = new Person("Baba", 50);
        System.out.println(Person.getCount());
        Person anne = new Person("Anne", 45);
        Person dede = new Person("Dede", 80);
        System.out.println(Person.getCount());
        Person nine = new Person("Nine", 78);
        Person ali = new Person("Ali", 20, baba, anne);
        System.out.println(Person.getCount());

        baba.setBaba(dede);
        anne.setAnne(nine);
        baba.setEs(anne);

        System.out.println(ali.getBaba().getBaba().getName());





        System.out.println(ali.getName());





    }


}
