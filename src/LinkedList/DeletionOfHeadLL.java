package LinkedList;
import Common.Node;

class Solution2LL{
    public Node deletionOfHead(Node head){
        head = head.next;

        return head;
    }
}

public class DeletionOfHeadLL {
    public static void main(String[] args){
        Solution2LL sol = new Solution2LL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

        System.out.print("After deletion : ");
        head = sol.deletionOfHead(head);

        Node temp1 = head;

        while(temp1 != null){
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;
        }
    }
}
