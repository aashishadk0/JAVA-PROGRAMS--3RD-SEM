package strings;

public class StringBufferDemo {
    // StringBuffer Methods.
    /**
     * 1. length()
     * 2. capacity()
     * 3. append(String str) --> its default capacity is upto 16 characters. If we
     * have to add more value then it increases in the way that,
     * (originalcapacity*2)+2
     * 4. insert(int starting_index, String str)
     * 5. replace()
     * 6. delete()
     * 7. reverse()
     */
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("");
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        System.out.println(sb2.length()); // 5
        System.out.println(sb2.capacity()); // 21

        sb2.append(" Aashish");
        System.out.println(sb2);

        sb2.insert(5, " sir, are you ");
        System.out.println(sb2);

        StringBuffer sb = new StringBuffer("Nepal");
        sb.replace(2, 4, "man");
        System.out.println(sb); // Nemanl

        sb.delete(2, 5);
        System.out.println(sb); // Nel

        sb.reverse();
        System.out.println(sb); // leN
    }
}

// Assignment: write the differences between String and StringBuffer.
