import java.util.HashMap;
import java.util.Scanner;

public class CountSubArraysWithXorK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = { 4, 2, 2, 6, 4};
        int k = 6;

        int prefixXor = 0;
        int count = 0;

        HashMap<Integer, Integer> mp = new HashMap();
        mp.put( 0, 1);

        for(int i = 0; i < arr.length; i++){
            prefixXor = prefixXor ^ arr[i];

            int target = prefixXor ^ k;


            if(mp.containsKey(target)){
                count += mp.get(target);
            }

            if (mp.containsKey(prefixXor)) {
                mp.put(prefixXor, mp.get(prefixXor) + 1);
            } else {
                mp.put(prefixXor, 1);
            }
        }

        System.out.print("Total number of subarrays: " + count);
    }
}
