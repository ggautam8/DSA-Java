package LinkedList;
import Common.Node;

class Solution3LL{
    public Node deleteTail(Node head){

        if(head == null || head.next == null){
            return null;
        }

        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        return head;
    }

    public void printList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}

public class DeletionOfTailLL {
    public static void main(String[] args){
        Solution3LL sol = new Solution3LL();


        Node head = new Node(3);
        head.next = new Node(4);
        head = sol.deleteTail(head);

        sol.printList(head);

    }
}
