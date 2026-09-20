class Solution205{
    public boolean isomorphicString(String s, String t){
        int[] m1 = new int[256], m2 = new int[256];
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;

            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
public class IsomorphicStrings {
    public static void main(String[] args) {
        Solution205 sol = new Solution205();

        String s = "paper";
        String t = "title";

        if (sol.isomorphicString(s, t)) {
            System.out.println("Strings are isomorphic.");
        } else {
            System.out.println("Strings are not isomorphic.");
        }
    }
}
