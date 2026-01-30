package Array;

import java.util.Scanner;

public class InstantiationMethod {
    public static void main(String[] args) {
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("\nEnter array element: ");
            int each = sc.nextInt();
            arr[i] = each;
        }
        sc.close();
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
