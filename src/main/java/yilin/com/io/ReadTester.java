package yilin.com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream; //輸入最上層類別;

public class ReadTester {
    public static void main(String[] args) {
         File  file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile()); //絕對路徑
        try{  //觀察監控區塊
            FileInputStream is  = new FileInputStream(file); //檔案最上層
        }catch(FileNotFoundException e){  //未來如果抓到
            e.printStackTrace(); //印出錯誤的追蹤狀態
            System.out.println("message");
         }
        System.out.println("file open success");
    }
}
