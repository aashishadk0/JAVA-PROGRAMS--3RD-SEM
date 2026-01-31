package exception;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 8 };
        System.out.println(arr[7]); // It throws exception.
    }
}
