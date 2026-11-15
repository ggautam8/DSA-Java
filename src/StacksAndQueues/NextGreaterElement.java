package StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

class Solution10{
    public int[] nextLargerElement(int[] arr){
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = -1;
                st.push(arr[i]);
            }
            else{
                nge[i] = st.peek();
                st.push(arr[i]);
            }
        }

        return nge;
    }
}
public class NextGreaterElement {
    public static void main(String[] main){
        Solution10 sol = new Solution10();

        int[] arr = { 4, 12 , 5, 3, 1, 2, 5, 3, 1, 2, 4, 6};

        System.out.print(Arrays.toString(sol.nextLargerElement(arr)));
    }
}
