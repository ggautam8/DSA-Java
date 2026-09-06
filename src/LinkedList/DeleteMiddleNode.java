package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution22LL{
    public Node deleteNode(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head.next.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}

public class DeleteMiddleNode{
    public static void main(String[] args){
        ConvertArrToLL c2l = new ConvertArrToLL();
        Solution22LL sol = new Solution22LL();

        int[] arr = { 1, 2, 3, 4};
        Node head = c2l.convert2LL(arr);
        head = sol.deleteNode(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
