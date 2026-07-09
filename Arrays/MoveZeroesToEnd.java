import java.util.*;

public class MoveZeroesToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("\nEnter elements of array: ");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Unmodified Array: [");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");

        int j = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return;
        }

        for(int i = j + 1; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.print("\nModified Array: [");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }
}
