package Strings;

class Solution9{
    public int maxDepth(String s){
        if(s.isEmpty()){
            return 0;
        }

        int cnt = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cnt++;
                if(cnt >= max){
                    max = cnt;
                }
            }
            else if(s.charAt(i) == ')'){
                cnt--;
            }
        }

        return max;
    }
}
public class MaxNestingDepthOfParentheses {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();

        String s = "(1+(2*3)+((8)/4))+1";

        System.out.print(sol.maxDepth(s));
    }
}
