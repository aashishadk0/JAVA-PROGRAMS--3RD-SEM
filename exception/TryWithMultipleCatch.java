package exception;

public class TryWithMultipleCatch {
    public static void main(String[] args) {
        int array[] = { 2, 5, 7, 3, 6 };
        try {
            System.out.println(array[6]);
            System.out.println(6 / 0);
        } catch (java.lang.ArithmeticException ae) {
            System.out.println(ae);
        } catch (java.lang.ArrayIndexOutOfBoundsException abe) {
            System.out.println(abe);
        }
    }
}
