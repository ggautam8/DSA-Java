package BinarySearch;

class Solution{
    public int search(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;
    }
}

public class SearchXinSortedArray {
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] arr = {-1, 0, 3, 5, 9, 12};

        int ind = sol.search( arr, -1);

        if(ind == -1){
            System.out.print("Target not present in array");
        }
        else{
            System.out.print("Target present at index " + ind);
        }
    }
}
