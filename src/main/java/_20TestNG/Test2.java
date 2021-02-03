package _20TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 extends Annotations{

    @Override
    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class 1");
    }

    @BeforeClass
    public void bc(){
        System.out.println("before class 2");
    }

    @Test (groups = "A")
    public void test1(){
        System.out.println("test1");
    }

    @Test(priority = 2, groups = "A")
    public void test2(){
        System.out.println("test2");
    }

    @Test(priority = 3, groups = "B")
    public void test3(){
        System.out.println("test3");
    }


}

/*
    Suite
        Test
            Class
                Method

--------------------------------------
    Suite
        Test1
            Class1
                Method1
                Method2
            Class2
                Method3
                Method4
       Test2
            Class3
                Method5
                Method6
            Class4
                Method7
                Method8



 */