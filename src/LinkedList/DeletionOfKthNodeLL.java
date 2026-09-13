package LinkedList;
import java.util.*;
import Common.Node;
import Common.ConvertArrToLL;

class Solution4LL{
    public void deleteNode(Node head){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x == 1){
            head = head.next;
        }
        int cnt = 0;

        Node temp = head;

        while(temp != null){
            cnt++;

            if(cnt + 1 == x){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }
}

public class DeletionOfKthNodeLL {
    public static void main(String[] args){
        Solution4LL sol = new Solution4LL();
        ConvertArrToLL c2l = new ConvertArrToLL();

        int[] arr = {1, 2, 3, 4};

        Node head = c2l.convert2LL(arr);

        System.out.print("Enter node number to be deleted : ");

        sol.deleteNode(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
}
