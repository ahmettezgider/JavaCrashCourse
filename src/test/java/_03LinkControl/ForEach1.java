package _03LinkControl;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEach1 {

    static ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    public static void main(String[] args) {
        filterList();
    }


    public static void forEach1(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void forEach2(){
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static void forEach3(){
        list.forEach(System.out::println);
    }

    public static void forEach4(){
        list.forEach(n -> System.out.println(n + ". eleman : " + n));
    }

    public static void lambda(int n){
        System.out.println(n + ". eleman : " + n);
    }

    public static void filterList(){
        list.stream()
                .filter(n->n>2)
                .filter(n->n<6)
                .forEach(System.out::println);
    }

}
