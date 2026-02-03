package FileIO;

import java.io.*;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("FileIO/writedemo.txt");
            fo.write(65); // writes 'A'
            String s = "pple";
            byte b[] = s.getBytes(); // converts String "pple" into byte array.
            fo.write(b);
            fo.flush();
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
