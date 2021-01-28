package _14ArrayLists;

import java.util.ArrayList;

public class List5 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);
        list.removeIf(n -> n%3 != 0);
        System.out.println(list);

        list.remove(new Integer(3));
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeIf(n ->
                    n % 15 == 0 || n % 9 == 0
        );

        System.out.println(list);

        list.clear();
        System.out.println(list);



    }
}
