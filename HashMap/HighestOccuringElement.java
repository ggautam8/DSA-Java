import java.util.*;

public class HighestOccuringElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int maxFr = 0;
        int ans = 0;

        int [] arr = new int[n];

        System.out.println("Enter elements of array: ");
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

            if(freq > maxFr){
                maxFr = freq;
                ans = key;
            }
            else if(freq == maxFr){ //y
                ans = Math.min(key, ans);
            }
        }
        System.out.println("Smallest most occuring element: " + ans);
    }
}
