class Solution1011{
    public int shipWithinDays(int[] weights, int days){
        int low = Integer.MIN_VALUE;
        int high = 0;
        int ans = 0;

        for(int i = 0; i < weights.length; i++){
            high += weights[i];

            if(weights[i] > low){
                low = weights[i];
            }
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int takenDays = 1;
            int sum = 0;

            for(int i = 0; i < weights.length; i++){
                if(sum + weights[i] > mid){
                    takenDays++;
                    sum = weights[i];
                }
                else{
                    sum += weights[i];
                }
            }

            if(takenDays <= days){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
}
public class LeastWeightCapacity {
    public static void main(String[] args) {
        Solution1011 sol = new Solution1011();

        int[] arr = { 1, 2, 3, 1, 1};

        System.out.print("Least weight capacity : " + sol.shipWithinDays(arr, 4));
    }
}
