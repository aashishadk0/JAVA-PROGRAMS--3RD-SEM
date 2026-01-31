package exception;

public class Finally {
    public static void main(String[] args) {
        int array[] = { 4, 4, 6, 7, };
        try {
            System.out.println(array[7]);
            System.out.println(3 / 0);
        } catch (java.lang.ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("Final");
        }
    }
}
