package _13Enum.paketEnum;
import static _13Enum.paketEnum.Enum1.*;

public class MainClass {

    public static void main(String[] args) {
        ClassEnum1 e2 = new ClassEnum1(1, "a", 1.2);
        System.out.println(e2.getId());

        System.out.println(e2);
        System.out.println("----------------------");
        System.out.println(kitap1.getId() + ", "+ kitap1.getName());
        printBook(kitap4);

    }



    public static void printBook(Enum1 book){
        System.out.println(book.getId() + ", " + book.getName() + ", " + book.getPrice());
    }
}
