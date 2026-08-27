package Common;

public class ConvertArrToLL {
    public Node convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
