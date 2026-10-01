package Strings;

class Solution11{
    public int myAtoi(String s){
        long res = 0;
        int sign = 1;
        int i = 0;

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        while(i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
            int digit = s.charAt(i) - '0';
            res = (res * 10) + digit;

            if((res * sign) <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            if((res * sign) >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            i++;
        }

        return (int) res * sign;
    }
}
public class String2Integer {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();

        String s = " -91283472332";
        System.out.print(sol.myAtoi(s));
    }
}
