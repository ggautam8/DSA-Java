package BinarySearch;

class Solution2{
    public int upperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > target){
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

public class UpperBound {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        int[] arr = { 1, 2, 2, 3};

        int ind = sol.upperBound(arr, 2);

        if(ind == arr.length){
            System.out.print("No index found such that arr[index] > 2");
        }
        else{
            System.out.print("Index " + ind + " is the smallest index such that arr[" + ind + "] > 2");
        }
    }
}
