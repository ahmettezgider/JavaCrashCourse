package _21TestNG2;

import org.testng.annotations.Test;

public class Test3 {
    @Test(groups = {"A"})
    public void test1(){
        System.out.println(1);
    }

    @Test(groups = {"A"})
    public void test2(){
        System.out.println(2);
    }

    @Test(groups = {"A, B"})
    public void test3(){
        System.out.println(3);
    }

    @Test(groups = {"B"})
    public void test4(){
        System.out.println(4);
    }
}
