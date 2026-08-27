import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Solution2 sol = new Solution2();

        System.out.print("Enter number to check: ");
        int n = sc.nextInt();

        boolean val = sol.isPalindrome(n);

        System.out.print(val);
    }
}

class Solution2{
    public boolean isPalindrome(int x){

        int rev = 0, rem = 0, temp = x;

        while(x > 0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return rev == temp;
    }
}