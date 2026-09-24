package StacksAndQueues;

class Solution3{
    int[] arr;
    int front;
    int rear;

    public void ArrayQueue() {
        arr = new int[1000];
        front = 0;
        rear = -1;
    }

    public void push(int x) {
        rear++;
        arr[rear] = x;
    }

    public int pop() {
        int value = arr[front];
        front++;
        return value;
    }

    public int peek() {
        return arr[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }
}
public class ImplementQueueUsingArrays {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        sol.ArrayQueue();
        sol.push(1);
        sol.push(2);
        sol.push(3);
        System.out.print(sol.pop());
        System.out.print(sol.peek());
    }
}
