package LinkedList;
import Common.DNode;
import Common.ConvertArrToDLL;

class Solution7DLL{
    public DNode insertB4Kth(int val, DNode head, int k){
        int cnt = 1;
        DNode temp = head;
        DNode newNode = new DNode(val);

        if(head == null){
            return newNode;
        }
        if(k == 1){
            head.prev = newNode;
            newNode.next = head;
            head = head.prev;
        }

        while(temp != null){
            if(cnt == k - 1){
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
                newNode.prev = temp;

                return head;
            }
            cnt++;
            temp = temp.next;
        }

        return head;
    }
}

public class InsertionB4KthDLL {
    public static void main(String[] args){
        Solution7DLL sol = new Solution7DLL();
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = { 10, 20, 30, 40, 50};

        DNode head = c2l.convert2DLL(arr);
        head = sol.insertB4Kth(69, head, 5);

        DNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
