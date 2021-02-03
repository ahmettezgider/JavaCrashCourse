package _20TestNG;

import org.testng.annotations.*;

public class Annotations {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after Method");
    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after Test");
    }

    @BeforeGroups
    public void beforeGroups(){
        System.out.println("before Groups");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("after Groups");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after Suite");
    }

}
