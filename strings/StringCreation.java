package strings;

public class StringCreation {
    public static void main(String[] args) {
        // String literals method
        String country = "Nepal";

        // Instantiation method

        String greet = new String("Good Morning from " + country);
        // creating null String
        String blank = new String();
        // by character array
        char array[] = { 'a', 'p', 'p', 'l', 'e' };
        String fruit = new String(array);

        System.out.println(greet);// Good Morning from nepal
        System.out.println(blank);// whitespace
        System.out.println(fruit);// apple
    }
}
