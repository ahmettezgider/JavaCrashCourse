package _13Enum.paketEnum;

public class ClassEnum1 {


    private int id;
    private String name;
    private double price;

    ClassEnum1(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return this.id + "-" + this.name + "-" + this.price;
    }
}
