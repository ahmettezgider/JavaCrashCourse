package _23Exceptions;

import java.util.ArrayList;
import java.util.Random;

public class Except1{
    int num;
    ArrayList<Except1> arr = new ArrayList<>(100);

    public Except1(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(100);      // CheckedException, Compile Time Exception
        }catch (Exception e){

        }
        //Thread.sleep(100);

        try {
            System.out.println(50/0);   // UnCheckedException, Run Time Exception
        }catch (Exception e){
            System.out.println("Hata");
        }
        System.out.println(50/0);

        while (true){
            new Except1(new Random().nextInt(100));
        }


    }
}



/*
                    java.lang

                    Object

                    Throwable
          ----------------------------------
         |                                |
     Exceptions                         Error
        IOExceptions                    StackOverFlow
        SQLExceptions                   JVM Error
        FileNotFound
        ....
        RunTimeException
            ArrayOutOfBound
            ArithmeticEx
            TypeMismach


    1. Checked Exceptions       : Compile Time Exceptions --> try-catch, throws Exception
    2. UnChecheckedExceptions   : Run Time Exceptions
    3. Error

 */
