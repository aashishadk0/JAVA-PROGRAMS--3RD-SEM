package wrapperclass;

public class WrapperDemo {
    public static void main(String[] args) {
        int i = 10;
        Integer iobj = Integer.valueOf(i); // Boxing: converting primitive to wrapper object
        System.out.println("Integer object: " + iobj);
    }
}
