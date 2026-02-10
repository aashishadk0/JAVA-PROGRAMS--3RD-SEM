package oop.inheritance.Super;

//Parent class
class Animal {
    public void walks() {
        System.out.println("I walk.");
    }
}

// Child class
public class InMethod extends Animal {
    @Override
    public void walks() {
        System.out.println("I don't walk. I run.");
    }

    void call() {
        walks(); // I dont walk. I run.
        super.walks(); // I walk
    }

    public static void main(String[] args) {
        InMethod i = new InMethod();
        i.call();
    }
}
