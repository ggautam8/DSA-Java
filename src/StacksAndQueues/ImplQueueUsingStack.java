package StacksAndQueues;

import java.util.Stack;

class Solution5{
    Stack<Integer> s1, s2;

    public Solution5(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int top(){
        return s1.peek();
    }
    public int pop(){
        return s1.pop();
    }
    public boolean isEmpty(){
        return s1.isEmpty();
    }
}
public class ImplQueueUsingStack {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();

        sol.push(1);
        sol.push(2);
        sol.push(3);
        System.out.print(sol.pop());
        System.out.print(sol.top());
    }
}
