import java.util.Scanner;

public class FindMissingNumberOptimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < n; i++){
            xor1 ^= arr[i];
        }

        for(int i = 0; i <= n; i++){
            xor2 ^= i;
        }

        System.out.println("Missing number : " + (xor1 ^ xor2));
    }
}
