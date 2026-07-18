import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args){
        int [] nums = { 1, 1, 1};
        int k = 2;

        Solution560 sol = new Solution560();
        int count = sol.subarraySum(nums, k);

        System.out.print("Total number of subarrays equaling k : " + count);
    }
}

class Solution560{
    public int subarraySum(int[] nums, int k){
        int count = 0;
        int sum = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            if(sum == k){
                count++;
            }

            int rem = sum - k;

            if(mp.containsKey(rem)){
                count++;
            }
            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
        }

        return count;
    }
}