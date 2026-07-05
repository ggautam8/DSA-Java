import java.util.Scanner;

public class FindNumThatAppearsOnceOptimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int xor = 0;

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();

            xor = xor ^ arr[i];
        }

        System.out.println("Number that occurred once : " + xor);

    }
}
