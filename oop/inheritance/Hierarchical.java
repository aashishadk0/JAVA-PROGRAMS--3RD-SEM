package oop.inheritance;

//Parent Class.
class Animal {
    static int legs = 4;
    static boolean tail = true;
}

// Dog class
class Dog extends Animal {
    static String name = "Dog";
}

// Cat class
class Cat extends Animal {
    static String name = "Cat";
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println(Dog.name);
        System.out.println(Dog.legs);
        System.out.println(Cat.name);
        System.out.println(Cat.tail);
    }

}
