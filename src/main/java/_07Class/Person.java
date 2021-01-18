package _07Class;

public class Person {
    public String name;
    public int age;
    public Person baba; // = new Person();
    public Person anne; // = new Person();
    public Person es;



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
