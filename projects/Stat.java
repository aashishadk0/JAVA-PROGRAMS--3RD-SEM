package projects;

//This program can be used for unbiased sampling in statistics when sample size is 2.
public class Stat {
    public static void main(String[] args) {
        // int array[] = { 2, 3, 4, 7, 9 };
        // findMean(array, 10);
        // int arr[] = { 4, 6, 3, 2, 3, 8, 9, 4, 1, 5 };
        int hw[] = { 2, 8, 14, 20 };
        findMean(hw, 6);
        // findMean(arr, 45);
    }

    public static void findMean(int[] array, int combination) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        float mean = (float) sum / array.length;
        System.out.println("\nMean = " + mean);
        int max = array.length;
        float samplemeanarray[] = new float[combination];
        int j = 0;
        for (int k = 0; k < array.length; k++) {
            float s1 = 0f;
            for (int i = k + 1; i < max; i++) {
                s1 = (array[k] + array[i]) / 2f;
                System.out.println(array[k] + "," + array[i] + " = " + s1);
                samplemeanarray[j] = s1;
                j++;
            }
        }
        // check below this
        float samplemean = 0;
        for (float f : samplemeanarray) {
            f = (float) f * (1f / combination);
            samplemean += f;
        }
        System.out.println("\nSample Mean = " + samplemean);
    }
}
