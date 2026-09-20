package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution9LL{
    public Node insertNode(int val, Node head, int x){

        Node newNode = new Node(val);

        if(head == null){
            return newNode;
        }
        Node temp = head;

        if(head.data == x){
            newNode.next = head;
            return newNode;
        }

        while(temp.next != null){
            if(temp.next.data == x){
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }

        return head;
    }
}
public class InsertionBeforeValX {
    public static void main(String[] args){
        Solution9LL sol = new Solution9LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr= {1, 2, 3, 4, 5, 6};

        Node head = c2l.convert2LL(arr);
        head = sol.insertNode(10, head, 1);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
