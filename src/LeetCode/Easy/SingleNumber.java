public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {6, 1, 2, 1, 2};

        Solution5 sol = new Solution5();
        int res = sol.singleNumber(nums);

        System.out.print("Single occurring element : " + res);
    }
}

class Solution5{
    public int singleNumber(int[] nums){

        int xor = 0;

        for(int i : nums){
            xor ^= i;
        }


        return xor;
    }
}
