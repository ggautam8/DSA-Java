class Solution70 {
    public int climbStairs(int n) {
        int curr = 1;
        int prev = 1;
        int next;

        for(int i = 1; i < n; i++){
            next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
public class ClimbingStairss {
    public static void main(String[] args) {
        Solution70 sol = new Solution70();

        System.out.print(sol.climbStairs(5));
    }
}
