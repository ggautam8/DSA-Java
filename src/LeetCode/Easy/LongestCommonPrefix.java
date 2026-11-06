import java.util.Arrays;

class Solution14{
    public String longestCommonPrefix(String[] strs){
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();

        String[] strs = {"flower","flow","flight"};
        System.out.print(sol.longestCommonPrefix(strs));
    }
}
