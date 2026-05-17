package sorting;

import java.util.Arrays;

public class MergeSort05 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 3, 4, 3, 2, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int start = 0, end = arr.length - 1;
        divide(arr, start, end);

    }

    public static void divide(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            divide(arr, start, mid);
            divide(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end) {

        int index1 = start, index2 = mid + 1, i = 0;
        int[] newArr = new int[end - start + 1];

        while (index1 <= mid && index2 <= end) {
            if (arr[index1] > arr[index2]) {
                newArr[i++] = arr[index2++];
            } else
                newArr[i++] = arr[index1++];
        }

        while (index1 <= mid) {
            newArr[i++] = arr[index1++];

        }
        while (index2 <= end) {
            newArr[i++] = arr[index2++];
        }

        for (int j = start, k = 0; j <= end; j++, k++) {
            arr[j] = newArr[k];
        }
    }

}
