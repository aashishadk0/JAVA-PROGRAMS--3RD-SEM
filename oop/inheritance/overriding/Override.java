package oop.inheritance.overriding;

//Parent class
class Animal {
    public void walks() {
        System.out.println("Animals walk.");
    }
}

// child class
class Dog extends Animal {
    public void walks() {
        System.out.println("I'm a Dog. I run.");
    }
}

public class Override {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walks();
    }
}
