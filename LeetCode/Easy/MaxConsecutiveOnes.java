public class MaxConsecutiveOnes {
    public static void main(String[] args){

        int [] nums = {1, 0, 1, 1, 1, 0};

        Solution4 sol = new Solution4();
        int res = sol.findMaxConsecutiveOnes(nums);
    }
}

class Solution4 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else if(nums[i] == 0){
                count = 0;
            }
        }
        return max;
    }
}