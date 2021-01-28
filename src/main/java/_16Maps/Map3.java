package _16Maps;

import java.util.HashMap;
import java.util.Map;

public class Map3 {

    public static void main(String[] args) {

        Map<Integer, Person> map1 = new HashMap<>();

        map1.put(1, new Person("ali", 23));
        map1.put(2, new Person("ahmet", 34));
        map1.put(3, new Person("Hasan", 25));

        for (Map.Entry<Integer, Person> m : map1.entrySet()){
            System.out.println(m.getKey() + ", " + m.getValue().getName());
        }

        for (Map.Entry m : map1.entrySet()){
            System.out.println(m.getKey() + ", " + m.getValue());
        }




    }

}



class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}