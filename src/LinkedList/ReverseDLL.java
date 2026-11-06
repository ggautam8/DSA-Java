package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution8DLL{
    public DNode reverseDll(DNode head, int n){
        DNode t = head;
        DNode l = head;
        int cnt = 1;

        if(head == null){
            return null;
        }
        while(l.next != null){
            l = l.next;
        }
        while(cnt <= n / 2){
            int temp;
            temp = t.data;
            t.data = l.data;
            l.data = temp;

            t = t.next;
            l = l.prev;
            cnt++;
        }
        return head;
    }
}

public class ReverseDLL {
    public static void main(String[] args){
        Solution8DLL sol = new Solution8DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = { 1, 2, 3, 4, 5, 6, 7};

        DNode head = c2l.convert2DLL(arr);
        head = sol.reverseDll(head, arr.length);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
