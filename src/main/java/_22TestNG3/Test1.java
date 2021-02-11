package _22TestNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class Test1 {

    @Test
    public void openBrowser(){

        //System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");

        driver.quit();

    }


    @Test
    public void openBrowserSelenide(){
        open("http://www.google.com");

    }

}
