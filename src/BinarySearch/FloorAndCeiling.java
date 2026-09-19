package BinarySearch;

class Solution4{
    public int[] getFloorAndCeil(int[] nums, int target){
        int[] res = new int[2];

        int low = 0;
        int high = nums.length - 1;
        res[1] = nums.length;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] <= target){
                res[0] = mid;
                low = mid + 1;
            }
            if(nums[mid] >= target){
                res[1] = mid;
                high = mid - 1;
            }

        }
        if(target > nums[nums.length - 1]){
            res[1] = -1;
        }
        else if(target < nums[0]){
            res[0] = -1;
        }
        return res;
    }
}

public class FloorAndCeiling {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();

        int[] arr = { 3, 4, 4, 4, 8, 10};

        int[] res = sol.getFloorAndCeil(arr, 5);
        System.out.print(res[0] + " " +  res[1]);
    }
}
