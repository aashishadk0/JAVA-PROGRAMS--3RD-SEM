package exception;

public class NullPointerException {
    public static void main(String[] args) {
        String s = null;
        int len = s.length(); // This line throws exception.
        System.out.println(len);
    }
}
