package _01SelenideUygulamalar;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test02 {

    @Test
    public void test1(){

        open("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");

        $("#cricle-btn")
                .scrollTo()
                .should(Condition.enabled)
                .click();

        $(".percenttext")
                .shouldHave(Condition.text("20"), Duration.ofSeconds(30));


    }

}
