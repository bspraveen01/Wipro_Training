package Day2;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {12, 43, 76, 45, 64};
        int arr2[] = {54, 77, 37, 82};

        int[] res = mergeArray(arr1, arr2);

        // Proper way to print array contents
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeArray(int arr1[], int arr2[]) {
        int[] mergedAr = new int[arr1.length + arr2.length];
        int i = 0;

        // Copy elements from arr1
        for (int s1 : arr1) {
            mergedAr[i++] = s1;
        }

        // Copy elements from arr2
        for (int s1 : arr2) {
            mergedAr[i++] = s1;
        }

        return mergedAr;
    }
}
