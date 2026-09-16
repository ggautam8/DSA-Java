package LinkedList;
import Common.Node;
import java.util.*;

class Solution13LL{
    public boolean detectCycle(Node head){

        Node temp = head;

        HashMap<Node, Integer> nodeMap = new HashMap<>();

        while(temp != null){
            if(nodeMap.containsKey(temp)){
                return true;
            }
            nodeMap.put(temp, 1);
            temp = temp.next;
        }

        return false;
    }
}

public class DetectCycleInLLBF {
    public static void main(String[] args){
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;

        Solution13LL sol = new Solution13LL();

        if(sol.detectCycle(head)){
            System.out.print("Loop detected in this linked list");
        }
        else{
            System.out.print("No loop detected in this linked list");
        }
    }
}
