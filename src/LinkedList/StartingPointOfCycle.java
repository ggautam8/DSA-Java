package LinkedList;
import Common.Node;

class Solution16LL{
    public Node detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }
}

public class StartingPointOfCycle {
    public static void main(String[] args){
        Solution16LL sol = new Solution16LL();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(7);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        Node temp = sol.detectCycle(head);
        if(temp != null){
            System.out.print("Loop detected in this linked list at node value " + temp.data);
        }
        else{
            System.out.print("No loop detected in this linked list");
        }
    }
}
