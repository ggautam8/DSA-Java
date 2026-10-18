package Strings;

class Solution14{
    public String intToRoman(int num){
        int[] values = {
                1000, 900, 500, 400,
                100, 90, 50, 40,
                10, 9, 5, 4, 1
        };

        String[] symbols = {
                "M", "CM", "D", "CD",
                "C", "XC", "L", "XL",
                "X", "IX", "V", "IV", "I"
        };

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                ans.append(symbols[i]);
                num -= values[i];
            }
        }

        return ans.toString();
    }
}
public class Integer2Roman {
    public static void main(String[] args) {
        Solution14 sol = new Solution14();

        int num = 3999;
        System.out.print(sol.intToRoman(num));
    }
}
