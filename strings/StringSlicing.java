package strings;

public class StringSlicing {
    public static void main(String[] args) {
        String s = "I am Nepali.";
        System.out.println(s.charAt(2));// a
        int start = 5, end = 10;
        char country[] = new char[end - start];
        s.getChars(start, end, country, 0);
        System.out.println(country); // Nepal
    }
}
