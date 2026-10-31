package Strings;

class Solution4{
    public String longestCommonPrefix(String[] strs){
        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
public class LongestComPrefix {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();

        String[] strs = {"flower","flow","flight"};
        System.out.print(sol.longestCommonPrefix(strs));
    }
}
