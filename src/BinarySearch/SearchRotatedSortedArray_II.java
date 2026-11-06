package BinarySearch;

class Solution9{
    public boolean search(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low)  /2;

            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low + 1;
                high = high - 1;
                continue;
            }

            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return false;
    }
}
public class SearchRotatedSortedArray_II {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();

        int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6};

        if(sol.search(arr, 10)){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
    }
}
