package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution6DLL{
    public DNode insertB4Tail(int val, DNode head){
        DNode newNode = new DNode(val);
        DNode temp = head;

        if(head == null){
            return newNode;
        }
        if(head.next == null){
            head.prev = newNode;
            newNode.next = head;
            head = head.prev;

            return head;
        }
        while(temp != null){
            if(temp.next.next == null){
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
                newNode.prev = temp;

                return head;
            }
            temp = temp.next;
        }

        return head;
    }
}

public class InsertionBeforeTailDLL {
    public static void main(String[] args){
        Solution6DLL sol = new Solution6DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = { 1, 2, 3, 4, 6};

        DNode head = c2l.convert2DLL(arr);
        head = sol.insertB4Tail(9, head);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
