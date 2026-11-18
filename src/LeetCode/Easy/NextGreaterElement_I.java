import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution496{
    public int[] nextGreaterElement(int[] nums1, int[] nums2){
        int[] nge = new int[nums2.length];
        Stack<Integer> st = new Stack<>();

        for(int i = nums2.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1;
                st.push(nums2[i]);
            }
            else{
                nge[i] = st.peek();
                st.push(nums2[i]);
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i--) {
            map.put(nums2[i], nge[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}

public class NextGreaterElement_I {
    public static void main(String[] args) {
        Solution496 sol = new Solution496();

        int[] nums1 = { 2, 4};
        int[] nums2 = { 1, 2, 3, 4};

        System.out.print(Arrays.toString(sol.nextGreaterElement(nums1, nums2)));
    }
}
