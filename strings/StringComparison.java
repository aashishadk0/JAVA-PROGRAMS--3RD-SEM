package strings;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s2)); // false
        System.out.println("hello".equals(s2)); // true

        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println("hello".equalsIgnoreCase(s3));// true

        System.out.println(s1.endsWith("lo")); // true
        System.out.println(s2.startsWith("he")); // true
        System.out.println(s2.startsWith("He")); // false
        System.out.println(s1.startsWith("ll", 2)); // true
    }

    // compareTo()
    // regionMatches()
}
