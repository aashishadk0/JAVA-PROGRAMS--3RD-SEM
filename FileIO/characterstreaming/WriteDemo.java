package characterstreaming;

import java.io.*;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("FileIO/character.docx", false);
            fw.write(65); // Writes 'A'
            char ch[] = { 'p', 'p', 'l', 'e' }; // appends 'pple'
            fw.write(ch);
            fw.write(" is good");// appends " is good"
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
