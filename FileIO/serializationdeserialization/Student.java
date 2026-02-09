package serializationdeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Serial {
    public static void main(String[] args) {
        try {
            Student s = new Student("Aashish", 1);
            FileOutputStream fout = new FileOutputStream("serializationdeserialization/abc.docx");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(s);
            oout.flush();
            oout.close();
            fout.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
