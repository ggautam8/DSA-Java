import java.util.Stack;

class Solution20{
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.peek();
                st.pop();

                if(s.charAt(i) == ')' && ch != '(' || s.charAt(i) == ']' && ch != '[' || s.charAt(i) == '}' && ch != '{'){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}
public class ValidParentheses {
    public static void main(String[] args) {
        Solution20 sol = new Solution20();

        String s = "(){}[]";
        System.out.print(sol.isValid(s));
    }
}
