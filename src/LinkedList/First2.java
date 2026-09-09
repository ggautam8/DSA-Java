package LinkedList;

import Common.Node;

public class First2 {
    public static Node convert2LL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args){
        int[] arr = {10, 3, 5, 7};

        Node head = convert2LL(arr);

        Node temp = head;
        temp.print();
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
