package StacksAndQueues;

class Solution2{
    int[] st;
    int top;

    public void ArrayStack(){
        st = new int[10];
        top = -1;
    }
    public void push(int x) {
        top = top + 1;
        st[top] = x;
    }

    public int pop() {
        int val = st[top];
        top = top - 1;
        return val;
    }

    public int top() {
        return st[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
public class ImplementStackUsingArrays {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        sol.ArrayStack();
        sol.push(1);
        sol.push(2);
        sol.push(3);
        System.out.print(sol.pop());
        System.out.print(sol.top());
    }
}
