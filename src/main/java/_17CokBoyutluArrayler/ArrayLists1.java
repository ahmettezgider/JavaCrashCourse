package _17CokBoyutluArrayler;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists1 {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3));
        System.out.println(list1);
        //  [1, 2, 3]


        System.out.println("----------------");
        ArrayList<Person> list2 = new ArrayList<>(){{
            add(new Person("a", 20));
            add(new Person("b", 32));
            add(new Person("c", 45));
        }};

        for (Person person : list2) {
            System.out.println(person.name + ", "+ person.age);
        }

        System.out.println("----------------");
        System.out.println(list2);

    }
}


class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
