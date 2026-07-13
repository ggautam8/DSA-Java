import java.util.Scanner;

public class MaximumConsecutiveOnes {
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

        int count = 0, max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }
            else if(arr[i] == 0){
                count = 0;
            }
        }

        System.out.println("Maximum consecutive ones : " + max);
    }
}
