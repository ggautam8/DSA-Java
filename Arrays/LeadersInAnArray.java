public class LeadersInAnArray {
    public static void main(String[] args){
        int[] nums = { 1, 2, 5, 3, 1, 2};

        int lea = nums[nums.length - 1];
        int maxR = nums[nums.length - 1];

        System.out.print("Leaders : " + lea);
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] > maxR){
                maxR = nums[i];
                System.out.print(" " + maxR);
            }
        }
    }
}
