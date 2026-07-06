import java.util.Scanner;

public class SortArrayOf0s1s2s {
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

     int low = 0, mid = 0, high = n - 1;

     while(mid <= high){
         if(arr[mid] == 0){             // mistake 1 : wrote just mid == 0
             int temp = arr[low];
             arr[low] = arr[mid];
             arr[mid] = temp;

             low++;
             mid++;
         }
         else if(arr[mid] == 1){        // mistake 2 : wrote just mid == 1
             mid++;
         }
         else{
             int temp = arr[high];
             arr[high] = arr[mid];
             arr[mid] = temp;

             high--;
             // no mid++ as swapped value from high needs to be checked as it can be 0
         }
     }

     System.out.print("Sorted array: [");
     for(int i = 0; i < n; i++){
         System.out.print(" " + arr[i] + " ");
     }
     System.out.print("]");
    }
}
