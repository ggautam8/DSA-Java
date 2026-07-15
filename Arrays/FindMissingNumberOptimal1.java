import java.util.Scanner;

public class FindMissingNumberOptimal1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int sumOfN = (n * (n + 1)) / 2;

        System.out.println("Missing number : " + (sumOfN - sum));
    }
}
