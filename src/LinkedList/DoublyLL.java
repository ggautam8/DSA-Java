package LinkedList;

import Common.ConvertArrToDLL;
import Common.DNode;

public class DoublyLL{
    public static void main(String[] args){
        ConvertArrToDLL c2l = new ConvertArrToDLL();

        int[] arr = {2, 4, 6, 8, 10};

        DNode temp = c2l.convert2DLL(arr);
        DNode last = temp.next.next.next.next;
        while(last != null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
}

