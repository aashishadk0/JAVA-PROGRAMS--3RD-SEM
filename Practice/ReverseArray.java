package Practice;

public class ReverseArray {
    public int[] reverse(int arr[]) {
        int temp, fp = 0, lp = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[fp];
            arr[fp] = arr[lp];
            arr[lp] = temp;
            fp++;
            lp--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int array[] = { 2, 5, 3, 6, 3, 5, 7 };
        int naya[] = r.reverse(array);
        for (int i : naya) {
            System.out.println(i);
        }
    }
}
