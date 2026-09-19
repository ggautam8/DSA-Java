package LinkedList;
import Common.Node;

class Solution1LL{
    public Node insertAtHead(int newData, Node head){
        return new Node(newData, head);
    }

    public void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class InsertionAtHeadLL{
    public static void main(String[] args){
        Solution1LL sol = new Solution1LL();

        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List : ");
        sol.printList(head);

        head = sol.insertAtHead(1, head);

        System.out.print("After insertion at head : ");
        sol.printList(head);
    }
}