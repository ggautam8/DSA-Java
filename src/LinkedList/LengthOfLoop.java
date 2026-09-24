package LinkedList;
import Common.Node;

class Solution17LL{
    public int findLen(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                int cnt = 1;
                Node temp = slow.next;

                while(temp != fast){
                    cnt++;
                    temp = temp.next;
                }
                return cnt;
            }
        }

        return 0;
    }
}
public class LengthOfLoop {
    public static void main(String[] args){
        Solution17LL sol = new Solution17LL();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(7);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = head;

        int len =  sol.findLen(head);

        if(len > 0) {
            System.out.print("Length of loop : " + len);
        }
        else{
            System.out.print("No loop detected");
        }
    }
}
