package DynamicProgramming;

class Solution1{
    public int climbStairs(int n) {
        int curr = 1;
        int prev = 1;
        int next = 0;

        for(int i = 1; i < n; i++){
            next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
public class ClimblingStairs {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        System.out.println(sol.climbStairs(1));
    }
}
