import java.util.*;

public class LongestSubArrayWithSumKHashMap{
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int sum = 0, maxLen = 0, len = 0;
        int count = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < n; i++){
            sum = sum + arr[i];

            // Case 1 if subArray starts from index 0
            if(sum == k){
                maxLen = i + 1;
                count++;
            }

            //Case 2 search for prev prefix sum
            int rem = sum - k;

            if(mp.containsKey(rem)){
                len = i - mp.get(rem);

                if(maxLen < len){
                    maxLen = len;
                }
                count++;
            }

            //Storing first occurrences of sum in hashmap
            if(!mp.containsKey(sum)){
                mp.put(sum, i);
            }
        }
        System.out.println("Longest Subarray Length: " + maxLen);
        System.out.println("Total number of subarrays: " + count);
    }
}