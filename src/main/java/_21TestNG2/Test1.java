package _21TestNG2;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Random;

public class Test1 {

    @Test(priority = 1, invocationCount = 5)
    public void test1(){
        System.out.println(new Random().nextInt(20));
    }

    @Test(timeOut = 1000)
    public void test2(){
        try {
            Thread.sleep(2000);
        }catch (Exception e){

        }
        Assert.assertEquals(1,1);
    }


    @Test(successPercentage = 60, invocationCount = 10)
    public void test3(){
        int num = new Random().nextInt(3);
        System.out.println(num);
        Assert.assertTrue(num<2);

    }



}
