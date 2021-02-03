package _20TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test(priority = 2)
    public void test1(){
        System.out.println("test1");
        int a = 1;
        Assert.assertEquals(a, 1);
    }

    @Test(priority = 1, enabled = true)
    public void test2(){
        System.out.println("test2");
        int a = 2;
        Assert.assertEquals(a, 2);
    }


    @Test(priority = -10, enabled = true, dependsOnMethods = {"test1"})
    public void test3(){
        System.out.println("test3");
        Object o = null;
        Assert.assertNull(o);
    }

    @Test(priority = -1, enabled = true, dependsOnMethods = "test2")
    public void test4(){
        System.out.println("test4");
        int a = 2;
        Assert.assertEquals(a, 2);
    }



}
