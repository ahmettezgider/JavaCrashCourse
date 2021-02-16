package _01SelenideUygulamalar;

import static com.codeborne.selenide.Condition.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test3 {

    @Test
    public void test1(){
        open("https://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");

        for (int i = 0; i < 5; i++) {
            $("button#save").scrollTo().should(enabled).click();
            System.out.println(
                    $("#loading").shouldHave(not(text("loading..."))).getText()
            );


        }

    }
}
