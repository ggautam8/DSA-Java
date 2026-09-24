class Solution1903{
    public String largestOddNumber(String num){
        String g = "";

        while (!num.isEmpty() && num.charAt(0) == '0') {
            num = num.substring(1);
        }
        for(int i = num.length() - 1; i >= 0; i--){
            if(num.charAt(i) % 2 == 1){
                return num.substring(0, i + 1);
            }
        }

        return g;
    }
}
public class LargestOddNumInString {
    public static void main(String[] args) {
        Solution1903 sol = new Solution1903();

        String num = "002306";
        System.out.print(sol.largestOddNumber(num));
    }
}
