import java.util.HashMap;
import java.util.Scanner;

public class TwoSumHashMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter target: ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> mp = new HashMap<>();

        System.out.print("Enter elements of array: \n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
            mp.put(arr[i], i);
        }

        for(int i = 0; i < n; i++){
            if(mp.containsKey(k - arr[i])){
                int idx = mp.get(k - arr[i]);
                if(idx != i) {
                    System.out.println("Pair : [" + i + ", " + mp.get(k - arr[i]) + "]");
                    break;
                }
            }
        }

    }
}
