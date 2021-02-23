package _02CucumberDataTable;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MM {

    public void OpenSite(String url){
        open(url);
    }

    public HomePage login(String uName, String pass){
        $("uName").setValue(uName);
        $("pass").setValue(pass).pressEnter();
        return new HomePage();
    }

    public void clicTo(String str){
        $("str").click();
    }

    public void sendKeysTo(String str){
        $("str").setValue(str);
        $("str").click();
        $("str").clear();
        $("str").shouldBe(Condition.appear);
    }




}
