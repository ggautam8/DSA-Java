import java.util.ArrayList;
import java.util.HashMap;

class Solution451{
    public String frequencySort(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> chars = new ArrayList<>(map.keySet());

        chars.sort((a, b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();

        for (char ch : chars) {
            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        Solution451 sol = new Solution451();

        String s = "tree";
        System.out.print(sol.frequencySort(s));
    }
}
