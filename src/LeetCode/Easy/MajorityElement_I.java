public class MajorityElement_I {
    public static void main(String[] args){
        int[] nums = { 2, 2, 1, 1, 1, 2, 2};

        Solution169 sol = new Solution169();

        int majEle = sol.majorityElement(nums);

        System.out.print("Majority Element: " + majEle);
    }
}

class Solution169{
    public int majorityElement(int[] nums){
        int ele = 0, count = 0, cnt = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }

        return ele;
    }
}