package _01SelenideUygulamalar;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class Test4 {

    @Test
    public void test1(){
        Configuration.browser = "firefox";
        Configuration.browserSize = "600x720";

        open("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        $("select#country+span").scrollTo().click();
        $$("ul#select2-country-results li").filter(Condition.text("united states")).first().click();
        sleep(2000);
    }

    @Test
    public void test2(){
        open("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        for (int i = 0; i < 5; i++) {
            $("input.select2-search__field").scrollTo().click();
            $$("ul.select2-results__options li").get(new Random().nextInt(50)).click();
        }
        sleep(2000);
    }

    @Test
    public void test3(){
        String[] arr = {"Arkansas", "Georgia", "Louisiana", "Nevada"};
        open("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        for (int i = 0; i < arr.length; i++) {
            $("input.select2-search__field").scrollTo().click();
            $$("ul.select2-results__options li").filter(Condition.text(arr[i])).first().click();
            //$$("ul.select2-results__options li").filter(Condition.text(arr[i])).get(0).click();
        }
        sleep(2000);
    }

    @Test
    public void test4(){
        String[] arr = {"Arkansas", "Georgia", "Louisiana", "Nevada"};
        open("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        $("input.select2-search__field").scrollTo().click();
        $$("ul.select2-results__options li")
                .filter(Condition.text("South"))
                .forEach(n-> System.out.println(n.getText()));
        sleep(2000);
    }
}
