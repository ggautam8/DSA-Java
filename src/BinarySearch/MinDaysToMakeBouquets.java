package BinarySearch;

class Solution17{
    public int minDays(int[] bloomDay, int m, int k){
        if((long) m * k > bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }
            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        while(low <= high){
            int mid = low + (high - low) / 2;
            int cnt = 0;
            int bouquetCnt = 0;

            for(int i = 0; i < bloomDay.length; i++){

                if(mid >= bloomDay[i]){
                    cnt++;

                    if(cnt == k){
                        bouquetCnt++;
                        cnt = 0;
                    }
                }
                else{
                    cnt = 0;
                }
            }

            if(bouquetCnt >= m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
public class MinDaysToMakeBouquets {
    public static void main(String[] args) {
        Solution17 sol = new Solution17();

        int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7};

        System.out.print("Minimum days : " + sol.minDays(arr, 2, 3));
    }
}
