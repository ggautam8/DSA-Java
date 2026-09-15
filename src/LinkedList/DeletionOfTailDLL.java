package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution3DLL{
    public DNode deleteTail(DNode head){
        DNode temp = head;

        if(head == null || head.next == null){
            return null;
        }
        while(temp != null){
            if(temp.next.next == null){
                DNode last = temp.next;
                temp.next = null;
                last.prev = null;

                return head;
            }
            temp = temp.next;
        }

        return head;
    }
}
public class DeletionOfTailDLL {
    public static void main(String[] args){
        Solution3DLL sol = new Solution3DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = {2, 4, 6, 8, 23};

        DNode head = c2l.convert2DLL(arr);
        head = sol.deleteTail(head);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
