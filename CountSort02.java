package sorting;

import java.util.Arrays;

public class CountSort02 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 3, 4, 3, 2, 6, 8, 1 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        // System.out.println(Arrays.toString(arr));

    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (max < e)
                max = e;
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int e : arr) {
            if (min > e)
                min = e;
        }
        return min;
    }

    public static void sort(int[] arr) {
        int max = max(arr);
        int min = min(arr);

        int freq[] = new int[max - min + 1];

        for (int e : arr) {
            freq[(e - min)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 1)
                System.out.print(" " + (i + min));
        }
    }

}
