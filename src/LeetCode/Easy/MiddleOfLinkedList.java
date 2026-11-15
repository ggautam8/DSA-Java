import Common.Node;
import Common.ConvertArrToLL;

class Solution876{
    public Node middleNode(Node head){
        Node temp = head;
        Node last = head;
        int len = 1;

        if(head == null || head.next == null){
            return head;
        }

        while(last.next != null){
            last = last.next;
            len++;
        }

        for(int i = 1; i <= len; i++){
            temp = temp.next;

            if(i == len/2){
                head = temp;
                return head;
            }
        }

        return head;
    }
}
public class MiddleOfLinkedList {
    public static void main(String[] args){
        Solution876 sol = new Solution876();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 1, 2, 3, 4, 5, 6};

        Node head = c2l.convert2LL(arr);
        Node mid = sol.middleNode(head);

        while(mid != null){
            System.out.print(mid.data + " ");
            mid = mid.next;
        }
    }
}
