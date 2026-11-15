package BinarySearch;

class Solution10{
    public int findMin(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] < min){
                min = nums[mid];
            }

            if(nums[low] < nums[mid]){
                if(nums[low] < nums[high]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] < nums[high]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return min;
    }
}

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();

        int[] arr = { 5, 1, 2, 3, 4};

        int min = sol.findMin(arr);
        System.out.print(min);
    }
}
