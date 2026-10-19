package BinarySearch;

class Solution1{
    public int lowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}

public class LowerBound {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        int[] arr = { 1, 2, 2, 6};

        int ind = sol.lowerBound(arr, 2);

        System.out.print(ind);
    }
}
