import java.util.Scanner;

public class MinCostToProcessAllElements {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++){
            k = k - nums[i];
        }
    }
}
