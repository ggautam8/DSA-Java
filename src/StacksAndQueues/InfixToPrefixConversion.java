package StacksAndQueues;

// 1. Reverse String & make sure to convert )( to ()
// 2. Convert that string to postfix
// 3. Reverse that postfix string

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution9{
    public int infixToPrefix(String s){
        String s1 = revInput(s);

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        Map<Character, Integer> priority = new HashMap<>();
        priority.put('^', 3);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('+', 1);
        priority.put('-', 1);

        int i = 0;

        return 0;
    }

    public String revInput(String s1){
        String rev = "";
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == '('){
                rev = ")" + rev;
            }
            else  if(s1.charAt(i) == ')'){
                rev = "(" + rev;
            }
            else {
                rev = s1.charAt(i) + rev;
            }
        }

        return rev;
    }
}
public class InfixToPrefixConversion {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();

        String s = "(a+b)*c";
        System.out.print(sol.infixToPrefix(s));
    }
}
