import java.util.Arrays;
import java.util.Stack;

class Solution503{
    public int[] nextGreaterElements(int[] nums){
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for(int i = (2 * nums.length - 1); i >= 0; i++){

            while(!st.isEmpty() && st.peek() <= nums[i % nums.length]){
                st.pop();
            }
            if(i < nums.length){
                nge[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % nums.length]);
        }

        return nge;
    }
}

public class NextGreaterElement_II {
    public static void main(String[] args) {
        Solution503 sol = new Solution503();

        int[] nums = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};

        System.out.print(Arrays.toString(sol.nextGreaterElements(nums)));
    }
}
