package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution21LL{
    public Node deleteNth(Node head, int n) {
        int len = 0;
        Node temp = head;

        if(n == 0){
            return head;
        }

        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int pos = len - n + 1;

        if (pos == 1) {
            return head.next;
        }
        temp = head;

        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}

public class DeletionOfNthNodeFromEndBF {
    public static void main(String[] args){
        ConvertArrToLL c2l = new ConvertArrToLL();
        Solution21LL sol = new Solution21LL();

        int[] arr = { 23, 12, 45, 67, 98, 7, 10};
        Node head = c2l.convert2LL(arr);
        head = sol.deleteNth(head, 1);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
