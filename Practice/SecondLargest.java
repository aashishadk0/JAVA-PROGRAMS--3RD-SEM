package Practice;

public class SecondLargest {
    public int secondLargest(int array[]) {
        int second = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (large < array[i]) {
                second = large;
                large = array[i];
            } else if (array[i] > second && second != array[i])
                second = array[i];
        }
        return second;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 53, 33, 62, 64, 33, 54 };
        SecondLargest sn = new SecondLargest();
        System.out.println(sn.secondLargest(arr));
    }
}