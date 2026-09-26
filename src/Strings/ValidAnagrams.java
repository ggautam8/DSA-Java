package Strings;

class Solution7{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int[] freq = new int[58];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            freq[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 58; i++){
            if(freq[i] != 0){
                return false;
            }
        }

        return true;
    }
}
public class ValidAnagrams {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();

        String s = "znagram";
        String t = "nzgaram";

        System.out.print(sol.isAnagram(s, t));
    }
}
