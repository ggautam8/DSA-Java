class Solution34{
    public static int[] searchRange(int[] nums, int target){
        int[] res = { -1, -1};
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                res[0] = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        low = 0;
        high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                res[1] = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return res;
    }
}

public class FirstAndLastPosition {
    public static void main(String[] args) {
        Solution34 sol = new Solution34();

        int[] arr = { 5, 7, 8, 8, 8, 10};

        int[] res = sol.searchRange(arr, 8);
        System.out.print(res[0] + " " + res[1]);
    }
}
