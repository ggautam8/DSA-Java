package Common;

public class ConvertArrToDLL {
    public DNode convert2DLL(int[] arr){
        if(arr.length == 0){
            return null;
        }

        DNode head = new DNode(arr[0]);
        DNode mover = head;

        for (int i = 1; i < arr.length; i++){
            DNode temp = new DNode(arr[i]);

            mover.next = temp;
            temp.prev = mover;

            mover = temp;
        }

        return head;
    }
}
