package strings;

public class SearchString {
    public static void main(String[] args) {
        String s = "Apple";
        System.out.println(s.indexOf('p'));// 1
        System.out.println(s.indexOf("le")); // 3
        System.out.println(s.indexOf('o')); // -1
        System.out.println(s.lastIndexOf('p'));// 2
    }
}
