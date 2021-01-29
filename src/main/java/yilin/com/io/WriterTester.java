package yilin.com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTester {

    public static void main(String[] args) throws IOException {
        File jkDir = new File("\\jk");
        jkDir.mkdir();
        FileWriter fw = new FileWriter("\\js\\output.txt");
        fw.write("abc");
        fw.flush();//資料要到達目的地
        fw.close();

    }
}
