package Strings;

class Solution3{
    public String largestOddNumber(String s){
        String g = "";

        while (!s.isEmpty() && s.charAt(0) == '0') {
            s = s.substring(1);
        }
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) % 2 == 1){
                return s.substring(0, i + 1);
            }
        }

        return g;
    }
}
public class LargestOddNumInAString {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        String s = "0002289";
        System.out.print(sol.largestOddNumber(s));
    }
}
