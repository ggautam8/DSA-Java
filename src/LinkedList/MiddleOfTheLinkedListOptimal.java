package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution11LL{
    public Node middleNode(Node head){
        Node fast = head;
        Node slow = head;

        if(head == null || head.next == null){
            return head;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class MiddleOfTheLinkedListOptimal {
    public static void main(String[] args){
        Solution11LL sol = new Solution11LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};

        Node head = c2l.convert2LL(arr);
        Node mid = sol.middleNode(head);

        while(mid != null){
            System.out.print(mid.data + " ");
            mid = mid.next;
        }

    }
}
