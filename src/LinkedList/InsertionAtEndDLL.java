package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution1DLL{
    public DNode insertEnd(int val, DNode head){

        DNode newNode = new DNode(val);
        DNode temp = head;

        if(head == null){
            return newNode;
        }

        while(temp != null){
            if(temp.next == null){
                temp.next = newNode;
                newNode.prev = temp;

                return head;
            }
            temp = temp.next;
        }

        return head;
    }
}

public class InsertionAtEndDLL {
    public static void main(String[] args){
        Solution1DLL sol = new Solution1DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = {1, 2, 3, 4};
        DNode head = c2l.convert2DLL(arr);
        head = sol.insertEnd(10, head);

        DNode temp = head;
        DNode last = head.next.next.next.next;
        while(last != null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
}
