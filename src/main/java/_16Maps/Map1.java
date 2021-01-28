package _16Maps;

import java.util.HashMap;

public class Map1 {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");

        System.out.println(map1);


        System.out.println(map1.get(2));
        map1.put(1, "d");
        System.out.println(map1);

        map1.putIfAbsent(1, "m");
        map1.putIfAbsent(3, "k");

        System.out.println(map1);

    }
}


/*
    Map  ->  (k,v)
            k: key      --> unique
            v: value

    HashMap
    LinkedHashMap
    TreeMap

 */
