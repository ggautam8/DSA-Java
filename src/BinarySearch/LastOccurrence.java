package BinarySearch;

class Solution5{
    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
public class LastOccurrence {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();

        int[] arr = { 3, 4, 4, 13, 13, 20, 40};

        int ind = sol.search(arr, 42222);
        System.out.print(ind);
    }
}
