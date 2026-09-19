package LinkedList;
import Common.Node;
import Common.ConvertArrToLL;

class Solution8LL{
    public Node insertNode(int val, Node head, int k) {
        int cnt = 1;
        Node newNode = new Node(val);
        Node temp;

        if (head == null) {
            return newNode;
        }

        if (k == 1) {
            temp = new Node(val, head);
            return temp;
        }

        temp = head;
        while (temp != null) {
            if (cnt == k - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
            }

            temp = temp.next;
            cnt++;
        }

        return head;
    }
}

public class InsertionAtKthLL {
    public static void main(String[] args){
        Solution8LL sol = new Solution8LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = { 1, 3, 7, 9, 11};

        Node head = c2l.convert2LL(arr);
        head = sol.insertNode(5, head, 6);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
