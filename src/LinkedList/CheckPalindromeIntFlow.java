package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

// This solution will case integer overflow error when list is too long

class Solution18LL{
    public boolean checkPalindrome(Node head){
        Node temp = head;
        int num = 0;

        while(temp != null){
            num = num * 10 + temp.data;
            temp = temp.next;
        }

        int rev = 0, rem;
        int x = num;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if(x == rev){
            return true;
        }
        else{
            return false;
        }

    }
}

public class CheckPalindromeIntFlow {
    public static void main(String[] args){
        Solution18LL sol = new Solution18LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 1, 2, 3, 4, 3, 2, 1};
        Node head = c2l.convert2LL(arr);

        if(sol.checkPalindrome(head)){
            System.out.print("Given linked list is a palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
