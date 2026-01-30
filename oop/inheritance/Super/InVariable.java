package oop.inheritance.Super;

//parent class
class Animal {
    String color = "White";
}

// Child class
public class InVariable extends Animal {
    String color = "Black";

    public void display() {
        System.out.println(color); // Black
        System.out.println(super.color); // White
    }

    public static void main(String[] args) {
        InVariable i = new InVariable();
        i.display();
    }
}
