package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution23LL{
    public Node sortLL(Node head){
        ConvertArrToLL c2l = new ConvertArrToLL();

        Node temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }

        int[] sorted = new int[len];

        int cnt = 0;
        for(temp = head; temp != null; temp = temp.next){
            sorted[cnt] = temp.data;
            cnt++;
        }

        for(int i = sorted.length - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(sorted[j] > sorted[j + 1]){
                    int tem = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = tem;
                }
            }
        }

        head = c2l.convert2LL(sorted);

        return head;
    }
}

public class SortLLBF {
    public static void main(String[] args){
        Solution23LL sol = new Solution23LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 2, 4, 1, 3, 5};
        Node head = c2l.convert2LL(arr);
        head = sol.sortLL(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
