class Solution162{
    public int findPeakElement(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] > nums[mid + 1]){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
public class FindPeakElement {
    public static void main(String[] args) {
        Solution162 sol = new Solution162();

        int[] arr = { 1, 2, 3, 1};

        int ele = sol.findPeakElement(arr);
        System.out.println(ele);
    }
}
