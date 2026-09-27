public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {6, 1, 2, 1, 2};

        Solution136 sol = new Solution136();
        int res = sol.singleNumber(nums);

        System.out.print("Single occurring element : " + res);
    }
}

class Solution136{
    public int singleNumber(int[] nums){

        int xor = 0;

        for(int i : nums){
            xor ^= i;
        }


        return xor;
    }
}
