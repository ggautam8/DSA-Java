public class NextPermutation {
    public static void main(String[] args){
        int[] nums = { 2, 1, 5, 4, 3, 0, 0};

        Solution31 sol = new Solution31();
        sol.nextPermutation(nums);

        System.out.print("Next permutation: [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + nums[i] + " ");
        }
        System.out.print("]");
    }
}

class Solution31{
    public void nextPermutation(int[] nums){
        int n = nums.length;

        int ind = -1;

        // Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;                      //stop at the first breakpoint
            }
        }

        // If no breakpoint, reverse the entire array
        if (ind == -1) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }

            return;
        }

        // Find the next greater element from the right
        for (int i = n - 1; i > ind; i--) {    // EDIT: i > ind
            if (nums[i] > nums[ind]) {
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        // Reverse the suffix
        int left = ind + 1;                // EDIT
        int right = n - 1;                 // EDIT

        while (left < right) {             // EDIT
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}