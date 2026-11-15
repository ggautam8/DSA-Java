class Solution1482{
    public int minDays(int[] bloomDay, int m, int k){
        if((long) m * k > bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] < low){
                low = bloomDay[i];
            }
            if(bloomDay[i] > high){
                high = bloomDay[i];
            }
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int cnt = 0;
            int bouqCnt = 0;

            for(int i = 0; i < bloomDay.length; i++){
                if(mid >= bloomDay[i]){
                    cnt++;

                    if(cnt == k){
                        bouqCnt++;
                        cnt = 0;
                    }
                }
                else{
                    cnt = 0;
                }
            }

            if(bouqCnt >= m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
public class MinDaysToMakeMbouquets {
    public static void main(String[] args) {
        Solution1482 sol = new Solution1482();

        int[] arr = {1,10,3,10,2};

        System.out.print("Minimum days : " + sol.minDays(arr, 3, 1));
    }
}
