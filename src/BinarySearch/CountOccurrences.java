package BinarySearch;


class Solution7{
    public int countOccurrences(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int first = -1;
        int last = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                first = mid;
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
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        if(first == -1){
            return 0;
        }
        return last - first + 1;
    }
}
public class CountOccurrences {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();

        int[] arr = {2, 2, 3, 3, 3, 3, 4};

        int cnt = sol.countOccurrences(arr, 2);
        System.out.print(cnt);
    }
}
