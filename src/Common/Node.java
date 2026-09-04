package Common;

import java.util.Objects;

public class Node
{
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this(data, null);
    }

    /*@Override
    public boolean equals(Object o) {
        if (!(o instanceof Node node)) return false;
        return data == node.data && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }*/

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
        // Node{data=8, next=null}
    }

    public void print() {
        System.out.println(this);
    }
}




