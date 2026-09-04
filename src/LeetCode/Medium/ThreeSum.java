import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int[] arr = {0, 0, 0, 0, 0};
        int n = arr.length;

        Solution15 obj = new Solution15();
        List<List<Integer>> res = obj.threeSum(arr, n);

        for (List<Integer> triplet : res) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }

    }
}

class Solution15{
    public List<List<Integer>> threeSum(int[] nums, int n){

        Arrays.sort(nums);
        // Store final result
        List<List<Integer>> ans = new ArrayList<>();

        // first loop for first element
        for (int i = 0; i < n; i++) {
            // skip duplicates for first element
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            // Two pointers
            int left = i + 1, right = n - 1;

            // Find pairs for current arr[i]
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for left
                    while (left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    // Skip duplicates for rightt
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;
    }
}