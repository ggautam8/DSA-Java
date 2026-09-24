package StacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

class Solution4{
    Queue<Integer> q;

    public Solution4(){
        q = new LinkedList<>();
    }
    public void push(int x) {
        int size = q.size();

        q.offer(x);
        for(int i = 0; i < size; i++){
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }
    public int top() {
        return q.peek();
    }
    public boolean empty() {
        return q.isEmpty();
    }
}
public class ImplStackUsingQueue {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();

        sol.push(1);
        sol.push(2);
        sol.push(3);
        System.out.print(sol.pop());
        System.out.print(sol.top());
    }
}
