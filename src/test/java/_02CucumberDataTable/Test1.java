package _02CucumberDataTable;


import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import utils.Locators;
import utils.MenuLinks;
import utils.MyMethods;

import static com.codeborne.selenide.Selenide.*;

public class Test1 extends MyMethods implements Locators {



    @Test
    public void test4(){

       open(urlDe);
       acceptCookies();
       //navigateOnMenuTo(MenuLinks.TVADS);
       //verifyVideos();
        int numOfPicsCurrent = $$("#sbi_images a").size();
        int numOfPicsNew = 0;

        while (true){
            $("#sbi_load a",0).scrollIntoView(false).click();
            $("#sbi_load > a > span", 0)
                    .shouldBe(Condition.attribute("class", "sbi_btn_text"));
            numOfPicsNew = $$("#sbi_images a").size();
            System.out.println(numOfPicsCurrent + ", "+ numOfPicsNew);
            if (numOfPicsCurrent==numOfPicsNew)
                break;
            numOfPicsCurrent = numOfPicsNew;
        }




    }

    @Test
    public void test5(){
        //Configuration.headless = true;
        open(urlDe);
        acceptCookies();
        navigateOnMenuTo(MenuLinks.TVADS);
        zoom(0.5);
        sleep(3000);

    }



}
