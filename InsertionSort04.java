package sorting;

import java.util.Arrays;

public class InsertionSort04 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 3, 4, 3, 2, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int pivote = arr[i], j = i - 1;
            while (j >= 0 && pivote < arr[j]) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = pivote;
        }
    }

}
