import java.util.*;

public class LongestSubArrayWithSumK{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] nums = {0, 0, 0, 0};
        int k = 0;

        Solution325 sol = new Solution325();

        int maxLen = sol.maxSubArray(nums, k);
        System.out.println("Longest Subarray Length: " + maxLen);
    }
}

class Solution325{
    public int maxSubArray(int [] nums, int k){
        int max = 0, len = 0, sum = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            // Case 1 if subArray starts from index 0
            if(sum == k){
                max = i + 1;

            }

            //Case 2 search for prev prefix sum
            int rem = sum - k;

            if(mp.containsKey(rem)){
                len = i - mp.get(rem);

                if(max < len){
                    max = len;
                }
            }

            //Storing first occurrences of sum in hashmap
            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
        }
        return max;
    }
}