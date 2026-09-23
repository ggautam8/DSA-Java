class Solution1539{
        public int findKthPositive(int[] arr, int k){
            int low = 1;
            int high = arr.length - 1;

            while(low <= high){
                int mid = low + (high - low) / 2;
                int missing = arr[mid] - (mid + 1);

                if (missing < k) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

//            for(int i = 0; i < arr.length; i++){
//                if(arr[i] <= k){
//                    k++;
//                }
//                else{
//                    break;
//                }
//            }
            return k + high + 1;
        }
}
public class KthMissingPositiveNum {
    public static void main(String[] args) {
        Solution1539 sol = new Solution1539();

        int[] arr = { 2, 5, 4, 7, 11};

        System.out.print(sol.findKthPositive(arr, 5));
    }
}
