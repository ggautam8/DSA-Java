package Arrays;

class Solution{
    public int arraySum(int[] nums){
        if (nums.length == 0) {
            return 0;
        }

        int first = nums[0];

        nums = java.util.Arrays.copyOfRange(nums, 1, nums.length);

        return first + arraySum(nums);
    }
}
public class SumOfArrayEle2 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print(sol.arraySum(arr));

    }
}
