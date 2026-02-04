package characterstreaming;

import java.io.*;

public class Practice {
    // Program that copies the string of character.docx and writes to the file
    // abc.txt
    public static void main(String[] args) {
        try {
            File f = new File("FileIO/character.docx");
            char ch[] = new char[(int) f.length()];
            FileReader fr = new FileReader(f);
            fr.read(ch);
            FileWriter fw = new FileWriter("FileIO/characterstreaming/abc.txt", false);
            fw.write(ch);
            fw.flush();
            fw.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
