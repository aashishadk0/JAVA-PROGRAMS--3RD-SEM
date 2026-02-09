package serializationdeserialization;

import java.io.*;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("FileIO/serializationdeserialization/abc.docx");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Student s = (Student) oi.readObject();
            System.out.println(s.name + s.id);
            oi.close();
            fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
