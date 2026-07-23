import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {
    public static void main(String[] args){


        // sort the array first, then only two pointer can be used
        int[] arr = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        Arrays.sort(arr);  // uses dual pivot quick sort which has O(n log n) TC and O(log n) SC

        List<List<Integer>> ans = new ArrayList<>();


        for(int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            for(int j = i + 1; j < arr.length; j++){

                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] +  arr[left] + arr[right];

                    if (sum == 9) {
                        ans.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));

                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }
                    } else if (sum < 9) {
                        left++;
                    } else {
                        right--;
                    }

                }
            }
        }

        for (List<Integer> quadruplet : ans) {
            for (int num : quadruplet) System.out.print(num + " ");
            System.out.println();
        }
    }
}
