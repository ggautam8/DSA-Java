import java.util.Stack;

class Solution907{
    public int sumSubarrayMins(int[] arr){

        int mod = 1000000007;

        int[] nse = new int[arr.length];
        int[] pse = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        //nse

        for(int i = 0; i < arr.length; i++){

        }


        return 0;
    }
}

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        Solution907 sol = new Solution907();

        int[] arr = { 3, 1, 2, 4};

        System.out.print("Smu of Subarray Minimums :" + sol.sumSubarrayMins(arr));
    }
}
