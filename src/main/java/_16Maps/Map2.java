package _16Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2 {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>(Map.of(1,"a", 2,"b", 3,"c"));

        System.out.println(map1);


        ArrayList<Integer> list  = new ArrayList<>(List.of(1,2,3));
        for (int n : list){
            System.out.print(n + ", ");
        }

        System.out.println();
        for(Map.Entry<Integer, String> m : map1.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }


    }
}
