package This;

public class ConstructorInvoke {
    public ConstructorInvoke() {
        System.out.println("I'm a constructor.");
    }

    public ConstructorInvoke(int a) {
        System.out.println("Hello! I have integer value. i.e. " + a);
        this();
    }

    public static void main(String[] args) {
        new ConstructorInvoke(8);
    }
}
