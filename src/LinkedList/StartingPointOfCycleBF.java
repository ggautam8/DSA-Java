package LinkedList;
import Common.Node;
import java.util.HashMap;

class Solution15LL{
    public Node detectCycle(Node head){
        Node temp = head;

        HashMap<Node, Integer> nodeMap = new HashMap<>();

        while(temp != null){
            if(nodeMap.containsKey(temp)){
                return temp;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }

        return null;
    }
}
public class StartingPointOfCycleBF {
    public static void main(String[] args){
        Solution15LL sol = new Solution15LL();

        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(7);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        Node temp = sol.detectCycle(head);
        if(temp != null){
            System.out.print("Loop detected in this linked list at node value " + temp.data);
        }
        else{
            System.out.print("No loop detected in this linked list");
        }
    }
}
