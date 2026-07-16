public class SortColors {
    public static void main(String[] args){
        int[] nums = {2, 0, 1};

        Solution75 sol = new Solution75();
        sol.sortColors(nums);

        System.out.print("[");
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i] + " ");
        }
        System.out.print("]");

    }
}

class Solution75{
    public void sortColors(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
