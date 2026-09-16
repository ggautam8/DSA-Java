package LinkedList;
import Common.Node;

class Solution14LL{
    public boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
public class DetectCycleInLL {
    public static void main(String[] args){
        Solution14LL sol = new Solution14LL();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        if(sol.detectCycle(head)){
            System.out.print("Loop detected in this linked list");
        }
        else{
            System.out.print("No loop detected in this linked list");
        }
    }
}
