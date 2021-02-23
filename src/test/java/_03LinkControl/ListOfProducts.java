package _03LinkControl;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ListOfProducts {


    @Test
    public void test01(){
        By search = By.cssSelector("#small-searchterms");
        By products = By.cssSelector(".product-grid>div");

        open("http://demowebshop.tricentis.com/");
        $(search).shouldBe(Condition.enabled)
                .setValue("pho")
                .pressEnter();

        $$(products)
                .forEach(e -> System.out.println(e.getText()));

        System.out.println("----2----------------------");
        $$(products)
                .filter(Condition.text("phone"))
                .forEach(e -> System.out.println(e.getText()));

        System.out.println("----3----------------------");
        $$(products)
                .filter(Condition.text("phone"))
                .filter(Condition.text("cover"))
                .forEach(e -> System.out.println(e.getText()));

        System.out.println("-----4---------------------");
        $$(products)
                .filter(Condition.text("phone"))
                .forEach(e -> {
                    String text = e.find(".prices").getText();
                    int price = Integer.parseInt(text.substring(0, text.indexOf(".")).replace(".",""));
                    System.out.println(price);
                });

        System.out.println("-----4---------------------");
        $$(products)
                .filter(Condition.text("phone"))
                .first()
                .click();
    }

}
