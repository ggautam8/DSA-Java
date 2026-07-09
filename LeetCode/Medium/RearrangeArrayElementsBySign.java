public class RearrangeArrayElementsBySign {
    public static void main(String[] args){
        int[] nums = { 3, 1, -2, -5, 2, -4};

        Solution2149 sol = new Solution2149();
        int[] res = sol.rearrangeArray(nums);

        System.out.print("Rearranged array: [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + res[i] + " ");
        }
        System.out.print("]");
    }
}

class Solution2149{
    public int[] rearrangeArray(int[] nums){
        int[] res = new int[nums.length];
        int posIndex = 0, negIndex = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                res[posIndex] = nums[i];
                posIndex += 2;
            }
            if(nums[i] < 0){
                res[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return res;
    }
}
