class Solution {

    public static void sort(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j][0] > arr[j + 1][0]) {

                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {

        int[][] arr = new int[nums.length][2];

        for (int k = 0; k < nums.length; k++) {
            arr[k][0] = nums[k];  // value
            arr[k][1] = k;        // original index
        }

        sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int sum = arr[i][0] + arr[j][0];

            if (sum == target) {
                return new int[]{arr[i][1], arr[j][1]};
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{};
    }
}