package exception;

public class NumberFormatException {
    public static void main(String[] args) {
        String s = "Apple";
        int a = Integer.parseInt(s);
        System.out.println(a); // Exception occurs
    }
}
