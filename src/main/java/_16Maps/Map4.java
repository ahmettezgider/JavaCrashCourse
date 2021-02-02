package _16Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Map4 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        list.forEach(n -> System.out.print(n*2 + ", "));

        System.out.println();
        Map<Integer, String> map1 = new HashMap<>(
                Map.of(1,"Ali", 2,"Veli", 3,"Hasan")
        );

        map1.forEach( (k, v) ->
                System.out.println(k + " - " + v + " , " + v.length() + ", " + v.toUpperCase())
        );

        map1.forEach( (k, v) -> {
            System.out.println(k);
            System.out.println(v);
            System.out.println(v.length());
            System.out.println(v.toUpperCase());
            System.out.println("------------");
        });


    }
}
