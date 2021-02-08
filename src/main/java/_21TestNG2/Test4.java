package _21TestNG2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

    @Test
    @Parameters("name")
    public void test1(String name){
        System.out.println(name);
    }

    @Test
    @Parameters("val")
    public void test2(int a){
        System.out.println(a);
    }
}
