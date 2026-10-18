package StacksAndQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution8{
    public String infixToPostfix(String s){
        int i = 0;
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        Map<Character, Integer> priority = new HashMap<>();
        priority.put('^', 3);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('+', 1);
        priority.put('-', 1);

        while( i < s.length()){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '1' && s.charAt(i) <= '9')){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }

                if(!st.isEmpty()) {
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && st.peek() != '(' && (priority.get(s.charAt(i)) <= priority.get(st.peek())) ){
                    ans.append(st.peek());
                    st.pop();
                }
                st.push(s.charAt(i));
            }
            i++;
        }
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }

        return ans.toString();
    }

}
public class InfixToPostfixConversion {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();

        String s = "x^2+3*y-4";
        System.out.println(sol.infixToPostfix(s));
    }
}
