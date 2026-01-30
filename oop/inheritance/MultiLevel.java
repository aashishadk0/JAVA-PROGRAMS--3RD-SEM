package oop.inheritance;

//Parent class
class Father {
    static String surname = "Adhikari";

    static void goesSchool() {
        System.out.println("Father doesn't go to school.");
    }
}

// child class of the parent.
class Son extends Father {
    static void goesSchool() {
        System.out.println("I go to school.");
    }
}

// child class of the Son.
class Daughter extends Son {
    static String Name = "Aashika " + surname;
}

public class MultiLevel {
    public static void main(String[] args) {
        Father.goesSchool();
        Son.goesSchool();
        System.out.println(Daughter.Name);
        Daughter.goesSchool();
    }
}