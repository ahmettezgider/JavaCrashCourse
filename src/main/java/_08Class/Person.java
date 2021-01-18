package _08Class;

public class Person {
    private static int familyCount = 0;

    private String name;
    private int age;
    private Person baba; // = new Person();  recursive  --> stack overflow
    private Person anne; // = new Person();
    private Person es;


    public static int getCount(){
        return familyCount;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        familyCount++;
    }

    public Person(String name, int age, Person baba, Person anne) {
        this(name, age);
        this.baba = baba;
        this.anne = anne;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getBaba() {
        return baba;
    }

    public void setBaba(Person baba) {
        this.baba = baba;
    }

    public Person getAnne() {
        return anne;
    }

    public void setAnne(Person anne) {
        this.anne = anne;
    }

    public Person getEs() {
        return es;
    }

    public void setEs(Person es) {
        this.es = es;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
