import java.util.Scanner;

public class FindNumThatAppearsOnce {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;

        System.out.print("Enter elements of array: \n");
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

        for(int i = 0; i < max + 1; i++){
            if(hash[i] == 1){
                System.out.println("Number that occurred once : " + i);
            }
        }
    }
}
