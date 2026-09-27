package StacksAndQueues;
import Common.Node;

class Solution6{
    Node top;
    int size = 0;

    Solution6(){
        top = null;
    }
    public void push(int x){
        Node temp = new Node(x);
        temp.next = top;
        top = temp;

        size = size + 1;
    }
    public int pop(){
        if(top == null){
            return -1;
        }
        Node temp = top;
        top = top.next;

        size = size - 1;
        return temp.data;
    }
    public int top(){
        if(top == null){
            return -1;
        }
        return top.data;
    }
    public int size(){
        return size;
    }
}
public class ImplementStackUsingLL {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();

        sol.push(1);
        sol.push(2);
        sol.push(3);
        System.out.println(sol.pop());
        System.out.println(sol.top());
        System.out.println(sol.size());
    }
}
