package Practice;

public class LargestSmallest {
    public int largeAmong(int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > large) {
                large = i;
            }
        }
        return large;
    }

    public int smallAmong(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < small) {
                small = i;
            }
        }
        return small;
    }

    public static void main(String[] args) {
        LargestSmallest ls = new LargestSmallest();
        int array[] = { 4, 3, 2, 6, 5, 0, 3 };
        System.out.println("Largest number: " + ls.largeAmong(array));
        System.out.println("Smallest number: " + ls.smallAmong(array));
    }
}
