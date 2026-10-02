package LeetCode.Hard;

class Solution410{
    public int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sum = sum + nums[i];
        }

        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int m = 1;
            int eleSum = 0;

            for (int i = 0; i < nums.length; i++) {
                if (eleSum + nums[i] <= mid) {
                    eleSum = eleSum + nums[i];
                } else {
                    m++;
                    eleSum = nums[i];
                }
            }

            if (m <= k) {
                high = mid - 1;
                ;
            } else {
                low = mid + 1;
            }

        }
        return low;
    }
}
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Solution410 sol = new Solution410();

        int[] nums = {10, 23, 43, 56, 21};
        System.out.print(sol.splitArray(nums, 3));
    }
}

