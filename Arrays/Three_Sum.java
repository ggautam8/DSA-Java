import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args){

        // sort the array first, then only two pointer can be used
        int[] arr = {-1, 0, 1, 2, -1, -4};
        Arrays.sort(arr);  // uses dual pivot quick sort which has O(n log n) TC and O(log n) SC

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){

            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }

            int j = i + 1;
            int k = arr.length - 1;

            while(j < k){
                int sum  = arr[i] + arr[j] + arr[k];

                 if(sum == 0){
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));

                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j - 1]){
                        j++;
                    }
                    while(j < k && arr[k] == arr[k - 1]){
                        k--;
                    }
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }

            }
        }

        for (List<Integer> triplet : ans) {
            for (int num : triplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
