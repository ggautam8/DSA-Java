package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution2DLL{
    public DNode deleteHead(DNode head){
        if(head == null || head.next == null){
            return null;
        }

        head = head.next;
        head.prev = null;

        return head;
    }
}

public class DeletionOfHeadDLL {
    public static void main(String[] args){
        Solution2DLL sol = new Solution2DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = { 1, 2, 3, 4, 5};

        DNode head = c2l.convert2DLL(arr);
        head = sol.deleteHead(head);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
