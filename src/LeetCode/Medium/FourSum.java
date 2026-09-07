import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args){
        int[] nums = {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;

        Solution18 obj = new Solution18();
        List<List<Integer>> res = obj.fourSum(nums, target);

        for (List<Integer> quadruplet : res) {
            for (int num : quadruplet) System.out.print(num + " ");
            System.out.println();
        }

    }
}

class Solution18{
    public List<List<Integer>> fourSum(int[] nums, int target){

        Arrays.sort(nums);
        // Store final result
        List<List<Integer>> ans = new ArrayList<>();

        // first loop for first element
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            for(int j = i + 1; j < nums.length; j++){
            // skip duplicates for first element
                if (j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }

                // Two pointers
                int left = j + 1, right = nums.length - 1;

                // Find pairs for current arr[i]
                while(left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for left
                        while (left < right && nums[left] == nums[left - 1]){
                            left++;
                        }
                        // Skip duplicates for rightt
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                    else if(sum < target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}