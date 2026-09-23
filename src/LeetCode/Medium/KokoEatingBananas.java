class Solution875{
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;

        for (int i = 0; i < n; i++) {
            total += piles[i];
        }

        int low = (int) ((total + h -1) / h);
        int high = (int) ((total - 2*n + h + 1) / (h - n + 1));

        while (low < high) {
            int mid = low + (high - low) / 2;
            int time = 0;

            for (int i = 0; i < n; i++) {
                time += (piles[i] + mid - 1) / mid;
            }

            if (time > h) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
public class KokoEatingBananas {
    public static void main(String[] args) {
        Solution875 sol = new Solution875();

        int[] arr = { 30,11,23,4,20};
        System.out.print("Minimum hours to eat all bananas : " + sol.minEatingSpeed(arr, 5));
    }
}
