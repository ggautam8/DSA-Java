public class MaximumSubarraySum {
    public static void main(String[] args){
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4};

        Solution53 sol = new Solution53();
        int maxSum = sol.maxSubArray(nums);
    }
}

class Solution53{
    public int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}