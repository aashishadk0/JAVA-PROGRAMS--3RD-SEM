package exception;

import java.lang.ArithmeticException;

public class throwKeyword {
    public static void ageCheck(int age) throws Exception {
        if (age < 18)
            throw new ArithmeticException("Not illegible");
        else
            System.out.println("Youre able to vote.");
    }

    public static void main(String[] args) {
        try {
            ageCheck(26);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
