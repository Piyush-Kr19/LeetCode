
class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i : nums) {
            if (i == 0) {
                zeros++;
            } else if (i == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        int i = 0;

        while (zeros > 0) {
            nums[i++] = 0;
            zeros--;
        }

        while (ones > 0) {
            nums[i++] = 1;
            ones--;
        }

        while (twos > 0) {
            nums[i++] = 2;
            twos--;
        }
    }
}

