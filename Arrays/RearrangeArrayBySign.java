public class RearrangeArrayBySign {
    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        int posIndex = 0, negIndex = 1;
        int[] arr = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                arr[posIndex] = nums[i];
                posIndex += 2;
            }
            if(nums[i] < 0){
                arr[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        System.out.print("Rearranged array: [");
        for(int i = 0; i < nums.length; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }
}
