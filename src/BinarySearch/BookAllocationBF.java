package BinarySearch;

// Brute Force using Linear Search

class Solution22{
    public int findPages(int[] nums, int m){
        if(m > nums.length){
            return -1;
        }
        int max = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            sum = sum + nums[i];
        }

        int low = max;
        int high = sum;

        for(int i = low; i <= high; i++){
            int students = 1;
            int pages = 0;

            for(int j = 0; j < nums.length; j++){
                if(pages + nums[j] <= i){
                    pages = pages + nums[j];
                }
                else{
                    students++;
                    pages = nums[j];
                }
            }
            if(students <= m){
                return i;
            }
        }
        return -1;
    }
}
public class BookAllocationBF {
    public static void main(String[] args) {
        Solution22 sol = new Solution22();

        int[] pages = { 12, 34, 67, 90};
        System.out.print(sol.findPages(pages, 3));
    }
}
