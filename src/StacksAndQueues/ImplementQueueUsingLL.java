package StacksAndQueues;
import Common.Node;

class Solution7{
    Node start, end;
    int size = 0;

    public Solution7(){
        start =null;
        end = null;
    }
    public void push(int x){
        Node temp = new Node(x);

        if(start == null){
            start = temp;
            end = temp;
            size++;
        }
        else{
            end.next = temp;
            end = temp;
            size++;
        }
    }
    public int pop(){
        if(start == null){
            return -1;
        }
        Node temp = start;
        start = start.next;
        size--;

        return temp.data;
    }
    public int top(){
        if(start == null){
            return -1;
        }

        return start.data;
    }
    public int size(){
        return size;
    }
}
public class ImplementQueueUsingLL {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();

        sol.push(1);
        sol.push(2);
        sol.push(3);
        sol.push(4);
        sol.push(5);
        sol.push(6);

        System.out.println(sol.pop());
        System.out.println(sol.top());
        System.out.println(sol.size());
    }
}
