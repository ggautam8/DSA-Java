class Solution704{
    public int search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
//          int mid = (low + high) / 2;
            int mid = low + (high - low) / 2;   // SAVES FROM INTEGER OVERFLOW
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        Solution704 sol = new Solution704();

        int[] arr = {-12, -3, 1, 45, 56, 89};

        int ind = sol.search( arr, -3);

        if(ind == -1){
            System.out.print("Target not found");
        }
        else{
            System.out.print("Target found at index " + ind);
        }
    }
}
