package _03LinkControl;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class linkSteps {

    ElementsCollection elementList;

    @Given("a user on {string}")
    public void aUserOn(String url) {

        open(url);

    }

    @Then("a all links should be defined")
    public void aAllLinksShouldBeDefined() {
        for (SelenideElement a : $$ ("a")){
            System.out.println(a.getAttribute("href"));
        }
    }

    @Then("a all links should be defined under cssSelector {string}")
    public void aAllLinksShouldBeDefinedUnderCssSelector(String selector) {
        elementList = $$(selector);

        elementList.forEach(element -> System.out.println(element.getAttribute("href")));


    }

    @Then("a all links should be properly defined")
    public void aAllLinksShouldBeProperlyDefined() throws IOException {

        for (SelenideElement element : elementList) {
            String url = element.getAttribute("href");
            Assert.assertEquals(getReturnCodeOf(url), 200);
        }

    }


    public int getReturnCodeOf(String url) throws IOException {
        URL link = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) link.openConnection();
        connection.setConnectTimeout(5000);
        connection.connect();
        int code = connection.getResponseCode();
        connection.disconnect();
        return code;
    }
}
