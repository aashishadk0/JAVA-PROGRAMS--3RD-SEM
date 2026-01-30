package oop.inheritance.Super;

//Parent class
class Animal {
    public Animal() {
        System.out.println("I'm an Animal Constructor.");
    }
}

// child Class
public class InConstructor extends Animal {
    public InConstructor() {
        super();
        System.out.println("I'm a dog constructor.");
    }

    public static void main(String[] args) {
        new InConstructor();
    }
}
