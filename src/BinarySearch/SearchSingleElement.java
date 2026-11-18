package BinarySearch;

class Solution12{
    public int singleNonDuplicate(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--;
            }

            if(nums[mid] == nums[mid + 1]){
                low = mid + 2;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}
public class SearchSingleElement {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();

        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 8, 8};

        int ele = sol.singleNonDuplicate(arr);
        System.out.print(ele);
    }
}
