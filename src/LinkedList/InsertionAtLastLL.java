package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution7LL{
    public Node insertAtLast(int val, Node head){

        if(head == null){
            return new Node(val);
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(val);

        return head;
    }
}

public class InsertionAtLastLL {
    public static void main(String[] args){
        Solution7LL sol = new Solution7LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = {1, 3, 5, 7};
        Node head = c2l.convert2LL(arr);
        Node temp = head;

        System.out.print("Current ll : ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        System.out.print("After insertion : ");
        head = sol.insertAtLast(1, head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
