package BinarySearch;

class Solution16{
    public int minEatingSpeed(int[] piles, int h){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;

//        int start = (int) ((total + h -1) / h);                   total here is the sum of all arr elements
//        int end = (int) ((total - 2*n + h + 1) / (h - n + 1));    Crazy 0ms solution

        while(low <= high){
            int mid = low + (high - low) / 2;
            int hrTaken = 0;

            // Calculating hours to finish bananas with ceil
            for(int i = 0; i < piles.length; i++){
                hrTaken += (piles[i] + mid - 1) / mid ;
            }

            if(hrTaken <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}
public class KokoEatsBananas {
    public static void main(String[] args) {
        Solution16 sol = new Solution16();

        int[] arr = { 30,11,23,4,20};
        System.out.print("Minimum hours to eat all bananas : " + sol.minEatingSpeed(arr, 5));
    }
}
