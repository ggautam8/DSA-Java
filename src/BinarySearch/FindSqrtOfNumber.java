package BinarySearch;

class Solution14{
    public int floorSqrt(int n){
        if (n < 2){
            return n;
        }

        int low = 1;
        int high = n / 2;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }

        return high;
    }
}
public class FindSqrtOfNumber {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();

        System.out.print("Floor square root : " + sol.floorSqrt(-1));
    }
}
