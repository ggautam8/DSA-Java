import java.util.*;

public class Selection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Before sorting: [");
        for(int i = 0; i < n; i++) {
            System.out.print(" " + arr[i] + " ");
        }

        System.out.print("Sorted array: [");
        for(int i = 0; i < n; i++){

        }
    }
}
