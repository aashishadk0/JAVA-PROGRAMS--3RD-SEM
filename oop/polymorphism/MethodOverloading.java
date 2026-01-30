package oop.polymorphism;

//On the basis of number of Parameters
class NumberBased {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

// On the basis of type of parameter.
class TypeBased {
    public static void show(int a) {
        System.out.println("I'm a integer: " + a);
    }

    public static void show(char a) {
        System.out.println("I'm a character: " + a);
    }

    public static void show(String a) {
        System.out.println("I'm a String: " + a);
    }

}

class OrderBased {
    public static void display(int a, char b) {
        System.out.println(a + ", " + b);
    }

    public static void display(char a, int b) {
        System.out.println(a + ", " + b);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        NumberBased.add(2, 4, 5);
        NumberBased.add(2, 5);

        TypeBased.show("K xa khabar");
        TypeBased.show('i');
        TypeBased.show(45);

        OrderBased.display('a', 054);
        OrderBased.display(58, 'u');
    }
}
