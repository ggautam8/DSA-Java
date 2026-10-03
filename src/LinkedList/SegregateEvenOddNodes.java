package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution20LL{
    public Node segregateLL(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;

        if(head == null || head.next == null){
            return head;
        }

        while(even != null && even.next != null ){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;

        return head;
    }
}

public class SegregateEvenOddNodes {
    public static void main(String[] args){
        ConvertArrToLL c2l = new ConvertArrToLL();
        Solution20LL sol = new Solution20LL();

        int[] arr = { 1, 2, 3, 4, 5};
        Node head = c2l.convert2LL(arr);
        head = sol.segregateLL(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
