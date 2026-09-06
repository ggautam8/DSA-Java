package Common;

public class DNode {
    public DNode prev;
    public int data;
    public DNode next;

    DNode(DNode prev, int data, DNode next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public DNode(int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}
