class Solution1283{
    public int smallestDivisor(int[] nums, int threshold){
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < low){
                low = nums[i];
            }
            if(nums[i] > high){
                high = nums[i];
            }
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int totCeil = 0;
            int ceil = 0;

            for(int i = 0; i < nums.length; i++){
                ceil = (nums[i] + mid - 1) / mid;
                totCeil = totCeil + ceil;
            }

            if(totCeil <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
public class FindSmallestDivisor {
    public static void main(String[] args) {
        Solution1283 sol = new Solution1283();

        int[] arr = { 1, 2, 5, 9};

        System.out.print("Smallest Divisor : " + sol.smallestDivisor(arr, 6));
    }
}
