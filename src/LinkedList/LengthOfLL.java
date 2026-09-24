package LinkedList;

class Node7{
    int data;
    Node7 next;

    Node7(int data1){
        data = data1;
        next = null;
    }
}

class Solution5LL{
    public Node7 convert2LL(int arr[]){
        Node7 head = new Node7(arr[0]);
        Node7 mover = head;

        for(int i = 1; i < arr.length; i++){
            Node7 temp = new Node7(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public int calcLength(Node7 head){
        int cnt = 0;
        Node7 temp = head;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }
}

public class LengthOfLL {
    public static void main(String[] args){
        Solution5LL sol = new Solution5LL();

        int[] arr = {1, 3, 5, 7, 9, 11};
        Node7 head = sol.convert2LL(arr);

        int cnt = sol.calcLength(head);

        System.out.print("Length of Linked List : " + cnt);
    }
}
