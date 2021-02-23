package _03LinkControl;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

    @Test
    public void Test1() throws IOException {
        List<String> list = new ArrayList<String>(){
            {
                add("https://www.mevlanacay.de/");
                add("https://shop.demoqa.com/");
                add("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
            }
        };

        for (String url : list) {
            System.out.println(getReturnCodeOf(url));
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


/*
        URL link = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) link.openConnection();
        connection.setConnectTimeout(5000);
        connection.connect();
        connection.disconnect();
 */