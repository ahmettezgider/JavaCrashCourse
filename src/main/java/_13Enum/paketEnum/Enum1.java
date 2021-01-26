package _13Enum.paketEnum;

public enum Enum1 {
    kitap1 (1, "a", 1.2),
    kitap2 (2, "b", 2.2),
    kitap3 (3, "c", 4.2),
    kitap4 (4, "d", 0.2),
    kitap5 (5, "e", 3.2)

    ;

    private int id;
    private String name;
    private double price;

    Enum1(int id, String name, double price) {
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

}
