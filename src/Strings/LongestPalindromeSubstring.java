package Strings;

class Solution12{
    public String longestPalindrome(String s){
        String res = "";
        int subLen = 0;

        for(int i = 0; i < s.length(); i++){
//            odd subs
            int l = i;
            int r = i;

            while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
                if((r - l + 1) > subLen) {
                    res = s.substring(l, r + 1);
                    subLen = r - l + 1;
                }
                l--;
                r++;
            }
            
//            even subs
            l = i;
            r = i + 1;
            
            while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
                if((r - l + 1) > subLen) {
                    res = s.substring(l, r + 1);
                    subLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return res;
    }
}
public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        Solution12 sol = new Solution12();

        String s = "aaabhsuushbaaba";
        System.out.print(sol.longestPalindrome(s));
    }
}
