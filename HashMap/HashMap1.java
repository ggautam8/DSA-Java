import java.util.Scanner;
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements of array:\n");
        for(int i = 0; i < n; i++){
            System.out.print("arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int key = arr[i];
            int freq = 0;

            if(mp.containsKey(key)){
                freq = mp.get(key);
            }
            freq++;

            mp.put(key, freq);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter queries: ");
        for(int i = 0; i < q; i++){
            System.out.print("Number: ");
            int num = sc.nextInt();
            if(mp.containsKey(num)) {
                System.out.println("Frequency: " + mp.get(num));
            }
            else{
                System.out.println("Frequency: 0");
            }
        }

    }
}
