import java.util.Scanner;

public class FindMajorityElement_I {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ele = 0, count = 0;

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            if(count == 0){
                ele = arr[i];
            }
            if(arr[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == ele){
                cnt++;
            }
        }

        if(cnt > n/2){
            System.out.print("Majority Element: " + ele);
        }
    }
}
