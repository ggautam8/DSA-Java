import java.util.*;

class Node6{
    int data;
    Node6 next;

    Node6(int data1){
        data = data1;
        next = null;
    }
}

class Solution237{
    public Node6 convert2LL(int arr[]){
        Node6 head = new Node6(arr[0]);
        Node6 mover = head;

        for(int i = 1; i < arr.length; i++){
            Node6 temp = new Node6(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    public Node6 deleteNode(Node6 head){

        return head;
    }
}

public class DeleteNodeInALinkedList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution237 sol = new Solution237();

        int [] arr = { 4, 5, 1, 9};

        Node6 head = sol.convert2LL(arr);
        Node6 temp = head;

        System.out.print("Enter node number to be deleted : ");
        int x = sc.nextInt();
        int cnt = 0;

        while(temp != null){
            cnt++;

            if(cnt + 1 == x){
                temp.next = temp.next.next;
            }
            else{
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        temp = head;
        System.out.println();

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
