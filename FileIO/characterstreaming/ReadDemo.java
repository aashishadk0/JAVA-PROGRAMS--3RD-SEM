package characterstreaming;

import java.io.*;

public class ReadDemo {
    public static void main(String[] args) {
        try {
            File f = new File("FileIO/character.docx");
            char ch[] = new char[(int) f.length()];
            FileReader fr = new FileReader(f);
            fr.read(ch);
            for (char c : ch) {
                System.out.print(c);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
