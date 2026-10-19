class Solution5{
    public String longestPalindrome(String s){
        String res = "";
        int subLen = 0;

        for(int i = 0; i < s.length(); i++){
//            odd len sub
            int l = i;
            int r = i;

            while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
                if((r - l + 1) > subLen){
                    res = s.substring(l, r + 1);
                    subLen = r - l + 1;
                }
                l--;
                r++;
            }

//            even len sub
            l = i;
            r = i + 1;

            while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))){
                if((r - l + 1) > subLen){
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
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();

        String s = "ssbaabssfsdssass";
        System.out.print(sol.longestPalindrome(s));
    }
}
