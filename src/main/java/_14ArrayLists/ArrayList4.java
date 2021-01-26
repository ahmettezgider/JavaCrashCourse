package _14ArrayLists;


import java.util.ArrayList;
import java.util.Random;

class Person{
    String name;
    int age;
    ArrayList<Integer> puan = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        for (int i = 0; i < 5; i++) {
            puan.add(new Random().nextInt(100));
        }

    }
}

public class ArrayList4 {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        Person p1 = new Person("Ali", 25);
        list.add(p1);

        list.add(new Person("Ahmet", 35));


        for (Person person : list) {
            System.out.println(person.name + ", " + person.age + ", " + person.puan);
        }





    }
}
