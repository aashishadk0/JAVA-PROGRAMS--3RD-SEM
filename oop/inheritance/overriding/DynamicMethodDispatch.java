package oop.inheritance.overriding;

//Parent class.
class A {
    public void classCheck() {
        System.out.println("I'm a method of A class.");
    }
}

// child class.
class B extends A {
    public void classCheck() {
        System.out.println("i'm a method of B class.");
    }
}

// child class.
class C extends A {
    public void classCheck() {
        System.out.println("I'm a method of C class.");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.classCheck();
        r = b;
        r.classCheck();
        r = c;
        r.classCheck();
    }
}
