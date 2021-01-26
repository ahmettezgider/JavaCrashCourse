package _12Polymorphims.paket12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Poly2 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        ArrayList<String> listArr = new ArrayList<>();
        LinkedList<String> listLink = new LinkedList<>();

        A(list1);
        A(list2);
        A(listArr);
        A(listLink);

        B(listArr);
        C(listLink);

    }

    public static void A(List lst){

    }

    public static void B(ArrayList lst){

    }

    public static void C(LinkedList lst){

    }

}
