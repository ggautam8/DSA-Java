package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution5DLL{
    public DNode insertHead(int val, DNode head){
        DNode newNode = new DNode(val);

        if(head == null){
            return newNode;
        }

        head.prev = newNode;
        newNode.next = head;
        head = head.prev;

        return head;
    }
}

public class InsertionBeforeHeadDLL {
    public static void main(String[] args){
        Solution5DLL sol = new Solution5DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = { 2, 4, 6, 8, 10};

        DNode head = c2l.convert2DLL(arr);
        head = sol.insertHead(10, head);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
