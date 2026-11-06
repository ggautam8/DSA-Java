class Solution921{
    public int minAddToMakeValid(String s) {
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
public class MinAddToMakeParenthesesValid {
    public static void main(String[] args) {
        Solution921 sol = new Solution921();

        String s = ")))(((";
        System.out.print(sol.minAddToMakeValid(s));
    }
}
