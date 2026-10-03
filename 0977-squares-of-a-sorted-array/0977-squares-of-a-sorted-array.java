class Solution {
    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public int[] sortedSquares(int[] nums) {

        int n = 0;
        int m = 0;

        // Count negative and non-negative
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] < 0) {
                n++;
            } else {
                m++;
            }
        }

        int[] a = new int[n];
        int[] b = new int[m];

        int i = 0;
        int j = 0;

        // Separate negative and non-negative
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] >= 0) {
                b[j] = nums[k];
                j++;
            } else {
                a[i] = nums[k];
                i++;
            }
        }

        // Square a
        for (i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }

        // Square b
        for (j = 0; j < b.length; j++) {
            b[j] = b[j] * b[j];
        }

        // Reverse a
        reverse(a);

        // Reset pointers for merging
        i = 0;
        j = 0;

        int index = 0;
        int[] arr = new int[n + m];

        // Merge
        while (i < n && j < m) {

            if (a[i] <= b[j]) {
                arr[index++] = a[i++];
            } else {
                arr[index++] = b[j++];
            }
        }

        while (j < m) {
            arr[index++] = b[j++];
        }
        while (i < n) {
            arr[index++] = a[i++];
        }
        return arr;
    }
}