package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution19LL{
    public boolean checkPalindrome(Node head){
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast.next.next == null){
                fast = slow.next;
                Node prev = fast;
                Node curr = fast.next;

                while(curr != null){
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                //  1 -> 2 -> 3 -> 3 -> 2 -> 1
                //  1 -> 2 -> 3 -> 3 <- 2 <- 1
                //  1 -> 2 -> 3    1 -> 2 -> 3
                //            |__ _ _ _ _ _ _|
                Node first = head;
                while(first != slow){
                    if(first.data != prev.data){
                        return false;
                    }
                    first = first.next;
                    prev = prev.next;
                }
                return true;
            }
            if(fast.next == null){
                fast = slow.next;
                Node prev = fast;
                Node curr = fast.next;

                while(curr != null){
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                Node first = head;
                while(first != slow){
                    if(first.data != prev.data){
                        return false;
                    }
                    first = first.next;
                    prev = prev.next;
                }
                return true;
            }
            //  1 -> 2 -> 3 -> 4 -> 3 -> 2 -> 1
            //  1 -> 2 -> 3 -> 4 -> 3 <- 2 <- 1
            //  1 -> 2 -> 3 -> 4    1 -> 2 -> 3
            //                 |__ _ _ _ _ _ _|
        }
        return false;
    }
}

public class CheckPalindromeRevLL {
    public static void main(String[] args){
        Solution19LL sol = new Solution19LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 1, 2, 3, 4, 5, 3, 2, 1};
        Node head = c2l.convert2LL(arr);

        if(sol.checkPalindrome(head)){
            System.out.print("Given linked list is a palindrome");
        }
        else{
            System.out.print("Not a palindrome");
        }
    }
}
