package Strings;

class Solution16{
    public int minAddToMakeValid(String s){
        int opening = 0;
        int closing = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                opening++;
            }
            else{
                if(opening == 0){
                    closing++;
                }
                else{
                    opening--;
                }
            }
        }
        return opening + closing;
    }
}
public class MinimumAddToMakeParenthesesValidGreedy {
    public static void main(String[] args) {
        Solution16 sol = new Solution16();

        String s = ")))(((";
        System.out.print(sol.minAddToMakeValid(s));
    }
}
