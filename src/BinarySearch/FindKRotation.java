package BinarySearch;

class Solution11{
    public int findKRotation(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
public class FindKRotation {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();

        int[] arr = { 4, 5, -2, -1, 0, 1, 2, 3};

        int k = sol.findKRotation(arr);
        System.out.print(k);
    }
}
