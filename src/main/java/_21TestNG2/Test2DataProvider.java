package _21TestNG2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2DataProvider {

    public void testX(){
        int a = 1;
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int[][] arr2 = new int[][] { {1,2}, {3,4,5} };
        int[][][] arr3 = new int[][][]{{{1,2}, {3,4}}};
    }


    @Test(dataProvider = "dataProvider1")
    public void test1(int a){
        System.out.println(a);
    }


    @DataProvider(name = "dataProvider1")
    public Object[] data1(){
        return new Object[] {1, 2, 3, 4, 5};
    }


    @Test(dataProvider = "dataProvider2")
    public void test2(Object[] arr){
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
    }

    @DataProvider(name = "dataProvider2")
    public Object[][] data2(){
        return new Object[][]{
                {1, "a", "ali1"},
                {2, "b", "ali2"},
                {3, "c", "ali3"},
                {4, "d", "ali4"},
                {5, "e", "ali5"}
        };
    }


}
/*
        int[] arr1 = new int[]{1,2,3,4,5}



 */