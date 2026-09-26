package Strings;

class Solution13{
    public int beautySum(String s){
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            int[] freq = new int[26];

            for (int j = i; j < s.length(); j++) {

                freq[s.charAt(j) - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                ans += max - min;
            }
        }

        return ans;
    }
}
public class SumOfBeautyAllSubstrings {
    public static void main(String[] args) {
        Solution13 sol = new Solution13();

        String s = "aabcbaa";
        System.out.print(sol.beautySum(s));
    }
}
