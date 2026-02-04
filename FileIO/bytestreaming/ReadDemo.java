package bytestreaming;

import java.io.*;

public class ReadDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("FileIO/WriteDemo.txt");
            int i;
            while ((i = fi.read()) != -1) {
                System.out.print((char) i);
            }
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}