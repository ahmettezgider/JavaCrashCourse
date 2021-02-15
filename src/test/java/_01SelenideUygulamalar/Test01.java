package _01SelenideUygulamalar;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class Test01 {

    /* https://www.seleniumeasy.com/test/table-search-filter-demo.html
            tabloda bulunan verilerden statüs"u in progress olanlarin Task"i ekrana yazdirilacak
     */

    @Test
    public void test1(){

        By table = By.cssSelector("table#task-table");
        By tableRows = By.xpath("//table[@id='task-table']//tr");
        open("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

        // driver.findElements() == $$


        for (SelenideElement e : $$ (tableRows)){
            System.out.println(e.getText());
            if (e.getText().contains("in progress")){
                System.out.println("*");
            }
        }

    }

    @Test
    public void test2(){
        By table = By.cssSelector("table#task-table");
        By tableRows = By.xpath("//table[@id='task-table']//tr");
        open("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

        // driver.findElements() == $$

        System.out.println($$ (tableRows).filter(Condition.text("in progress")).last().getText());

        System.out.println("----------------");
        for (SelenideElement e : $$ (tableRows).filter(Condition.text("in progress"))){
            System.out.println(e.getText());
        }
    }

    @Test
    public void test3(){
        By tableRows = By.xpath("//table[@id='task-table']//tr");
        open("https://www.seleniumeasy.com/test/table-search-filter-demo.html");


        String str = $$ (tableRows)
                .filter(Condition.text("in progress"))
                .filter(Condition.not(Condition.text("John")))
                .first()
                .getText();

        System.out.println(str);
    }


    @Test
    public void test4(){
        By tableRows = By.xpath("//table[@id='task-table']//tr");
        open("https://www.seleniumeasy.com/test/table-search-filter-demo.html");


        $$ (tableRows)
                .filter(Condition.text("in progress"))
                .forEach(System.out::println);

        System.out.println("---------------------------");
        $$ (tableRows)
                .filter(Condition.text("in progress"))
                .forEach(e-> System.out.println(e.getText()));


    }
}
