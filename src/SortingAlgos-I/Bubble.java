import java.util.Scanner;

public class Bubble {
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
        System.out.print("Current array: [");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");

        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted array: [");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }
}
