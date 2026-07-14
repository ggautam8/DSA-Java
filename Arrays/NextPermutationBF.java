import java.util.Scanner;

public class NextPermutationBF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        int ind = -1;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            for(int i = 0; i < n / 2; i++){
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        }
        else{
            // Find next greater element and swap
            for(int i = n - 1; i > ind; i--){
                if(arr[i] > arr[ind]){
                    int temp = arr[ind];
                    arr[ind] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }

            // Reverse the suffix using a for loop
            int left = ind + 1;
            int right = n - 1;

            for(; left < right; left++, right--){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.print("\nNext permutation: [");
        for(int i = 0; i < n; i++){
            System.out.print(" " + arr[i] + " ");
        }
        System.out.print("]");
    }
}