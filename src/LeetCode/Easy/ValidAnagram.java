class Solution242{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] freq = new int[128];

        for(char i : s.toCharArray()) freq[i]++;

        for(char i : t.toCharArray()) freq[i]--;

        for(int count : freq) {
            if(count > 0) return false;
        }
        return true;
    }
}
public class ValidAnagram {
    public static void main(String[] args) {
        Solution242 sol = new Solution242();

        String s = "anagram";
        String t = "nagaram";

        System.out.print(sol.isAnagram( s, t));
    }
}
