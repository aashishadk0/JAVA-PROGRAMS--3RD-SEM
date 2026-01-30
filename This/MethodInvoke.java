package This;

public class MethodInvoke {
    public void msg() {
        System.out.println("Hello I'm msg method.");
    }

    public void print() {
        this.msg();
    }

    public static void main(String[] args) {
        MethodInvoke m = new MethodInvoke();
        m.print();
    }
}
