package _15Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Sets3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(20));
        }

        System.out.println(list);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        set.removeIf(n -> n>10);
        System.out.println(set);


    }
}
