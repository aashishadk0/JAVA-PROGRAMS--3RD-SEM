package oop.inheritance;

//Parent class
class Animal {
    static int leg = 4;
    static boolean tail = true;
    static String type = "Domestic";
}

// Child class
class Cat extends Animal {
    static String name = "Cat";

    public void details() {
        System.out.println("Name = " + Cat.name);
        System.out.println("Legs = " + Cat.leg);
        System.out.println("Tail = " + Cat.tail);
        System.out.println("Type = " + Cat.type);
    }
}

public class Single {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.details();
    }
}
