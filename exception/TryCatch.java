package exception;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(5 / 0);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("\nThis exception is due to:" + e);
        }
        System.out.println("Code executed after handling exception.");
    }
}
