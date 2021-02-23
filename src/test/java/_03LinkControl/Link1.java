package _03LinkControl;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Link1 {


    public static void main(String[] args) throws IOException {


        URL url = new URL("http://www.google1.com");
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setConnectTimeout(5000);
        urlConn.connect();
        System.out.println(urlConn.getResponseCode() + ", " + urlConn.getResponseMessage());
        urlConn.disconnect();

    }




}
