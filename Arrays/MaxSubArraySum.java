import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int maxSub = Integer.MIN_VALUE;
        int sum = 0;
        int ansSt = 0, ansEnd = 0;
        int st = 0;

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();

            sum = sum + arr[i];

            if(sum > maxSub){
                maxSub = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        //  2  3  4  5 -2  1 -1
        System.out.print("Maximum Subarray Sum : " + maxSub);
    }
}
