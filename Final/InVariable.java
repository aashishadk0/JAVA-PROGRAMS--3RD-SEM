package Final;

public class InVariable {
    public static void main(String[] args) {
        final float PI = 3.1415f;
        System.out.println(PI);
        // PI = 5.3f; --> (This line throws error so I comment this line...)
        System.out.println(PI);
    }
}
