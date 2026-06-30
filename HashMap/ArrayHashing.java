import java.util.Scanner;

public class ArrayHashing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        System.out.println("Enter elements of array: ");

        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();

            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] hash = new int[max + 1];

        for(int i = 0; i < n; i++){
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        int num = 0;

        System.out.print("Enter number of queries: ");
        int m = sc.nextInt();

        System.out.print("\nEnter queries:\n");
        while(m-- != 0){
            System.out.print("\nNumber: ");
            num = sc.nextInt();

            if(num < max + 1) {
                System.out.println("\nFrequency: " + hash[num]);
            }
            else{
                System.out.println("\nFrequency : 0");
            }
        }

    }
}
