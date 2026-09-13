package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution4DLL{
    public DNode deleteKth(DNode head, int k){
        int cnt = 1;

        DNode temp = head;
        if(head == null){
            return null;
        }
        if(k == 1){
            head = head.next;
            head.prev = null;

            return head;
        }
        while(temp != null){
            if(cnt == k - 1){
                DNode node = temp.next;
                temp.next = temp.next.next;
                node.next = null;
                node.prev = null;
            }
            cnt++;
            temp = temp.next;
        }
        return head;
    }
}

public class DeletionOfKthNodeDLL {
    public static void main(String[] args){
        Solution4DLL sol = new Solution4DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = {10, 20, 30, 40, 50};

        DNode head = c2l.convert2DLL(arr);
        head = sol.deleteKth(head, 3);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
