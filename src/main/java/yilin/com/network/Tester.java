package yilin.com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("https://vue-lessons-api.herokuapp.com/dom/content");
           URL url = new URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/download?id=4b1b1eab-9338-4bcf-8b23-27e015f1714a&rid=49090d61-285a-4a17-a9c2-73a32b13f623");
            HttpURLConnection connection =(HttpURLConnection)url.openConnection();//專行問題
            InputStream is = connection.getInputStream(); //輸入串流
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = in.readLine();
            StringBuffer json = new StringBuffer();
            while(line !=null){
                System.out.println(line);
                line = in.readLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();

        }catch(IOException e){
            e.printStackTrace();
        }


    }
}
